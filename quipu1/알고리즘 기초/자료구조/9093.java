package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String[] words = br.readLine().split(" ");
            for (int j=0; j< words.length; j++) {
                StringBuffer sb = new StringBuffer(words[j]);
                String reverse = sb.reverse().toString();
                bw.write(reverse + " ");
            }
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