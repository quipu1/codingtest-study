package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");

        String answer = "1";
        for (int i=0; i<(word.length)/2; i++) {
            if (!word[i].equals(word[word.length-i-1])) {
                answer = "0";
                break;
            }
        }

        bw.write(answer);

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}