package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n != 1) {
            boolean prime = true;
            for (int i=2; i<=n; i++) {
                if (n%i == 0) {
                    bw.write(String.valueOf(i));
                    bw.newLine();

                    n = n/i;
                    prime = false;
                    break;
                }
            }

            if (prime) {
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}