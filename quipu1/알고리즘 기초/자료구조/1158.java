package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        Queue<Integer> circle = new LinkedList<>();
        for (int i=0; i<n; i++) {
            circle.offer(i+1);
        }

        bw.write("<");

        while (!circle.isEmpty()) {
            for (int j=0; j<k-1; j++) {
                circle.offer(circle.poll());
            }
            if (circle.size() == 1) {
                bw.write(String.valueOf(circle.poll()));
            } else {
                bw.write(circle.poll() + ", ");
            }
        }

        bw.write(">");

        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}