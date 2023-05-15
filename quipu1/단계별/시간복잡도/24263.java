package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(n));
        bw.newLine();
        bw.write("1");

        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}