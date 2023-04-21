package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int answer = 0;

        for (int i=0; i<str.length(); i++) {
            String word = String.valueOf(str.charAt(i));
            if ("ABC".contains(word)) {
                answer += 3;
            } else if ("DEF".contains(word)) {
                answer += 4;
            } else if ("GHI".contains(word)) {
                answer += 5;
            } else if ("JKL".contains(word)) {
                answer += 6;
            } else if ("MNO".contains(word)) {
                answer += 7;
            } else if ("PQRS".contains(word)) {
                answer += 8;
            } else if ("TUV".contains(word)) {
                answer += 9;
            } else {
                answer += 10;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}