package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            bw.write(" ".repeat(n-i-1) + "*".repeat(i) + "*" + "*".repeat(i));
            bw.newLine();
        }

        for (int j=1; j<n; j++) {
            bw.write(" ".repeat(j) + "*".repeat(n-j-1) + "*" + "*".repeat(n-j-1));
            bw.newLine();
        }

        /*
        4 0 1 0 4
        3 1 1 1 3
        2 2 1 2 2
        1 3 1 3 1
         */

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}