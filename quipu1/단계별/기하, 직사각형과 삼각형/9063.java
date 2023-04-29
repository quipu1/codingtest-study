package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> arrayX = new ArrayList<>();
        List<Integer> arrayY = new ArrayList<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayX.add(Integer.parseInt(st.nextToken()));
            arrayY.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayX);
        Collections.sort(arrayY);

        if (n > 1) {
            bw.write(String.valueOf((arrayX.get(arrayX.size()-1) - arrayX.get(0)) * (arrayY.get(arrayY.size()-1) - arrayY.get(0))));
        } else {
            bw.write("0");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}