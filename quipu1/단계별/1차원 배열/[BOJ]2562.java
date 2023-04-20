package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = -1;
        int maxIdx = -1;

        for (int i=1; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > maxNum) {
                maxNum = num;
                maxIdx = i;
            }
        }

        bw.write(String.valueOf(maxNum));
        bw.newLine();
        bw.write(String.valueOf(maxIdx));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}