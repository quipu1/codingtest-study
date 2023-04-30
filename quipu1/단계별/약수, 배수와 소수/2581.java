package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i=m; i<=n; i++) {

            boolean prime = true;

            if (i == 1) {
                prime = false;
            }

            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(list.stream().mapToInt(Integer::intValue).sum()));
            bw.newLine();
            bw.write(String.valueOf(list.get(0)));
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}