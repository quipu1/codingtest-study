package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int sol1 = a*(Integer.parseInt(String.valueOf(b.charAt(2))));
        int sol2 = a*(Integer.parseInt(String.valueOf(b.charAt(1))));
        int sol3 = a*(Integer.parseInt(String.valueOf(b.charAt(0))));
        int sol4 = sol1 + 10*sol2 + 100*sol3;

        bw.write(String.valueOf(sol1));
        bw.newLine();
        bw.write(String.valueOf(sol2));
        bw.newLine();
        bw.write(String.valueOf(sol3));
        bw.newLine();
        bw.write(String.valueOf(sol4));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}