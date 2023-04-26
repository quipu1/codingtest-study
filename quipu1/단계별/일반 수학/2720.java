package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //q 25 d 10 n 5 p 1
        int q, d, n = 0;
        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            int c = Integer.parseInt(br.readLine());
            q = c/25;
            c -= q*25;

            d = c/10;
            c -= d*10;

            n = c/5;
            c -= n*5;

            bw.write(q + " " + d + " "+ n + " " + c);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}