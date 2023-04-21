package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] strs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String str : strs) {
            if (s.contains(str)) {
                bw.write(s.indexOf(str) + " ");
            } else {
                bw.write("-1" + " ");
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