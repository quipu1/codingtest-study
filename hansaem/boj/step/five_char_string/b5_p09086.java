package boj.step.five_char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p09086 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p09086.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String str = String.valueOf(st.nextToken());
            sb.append(str.charAt(0) + "" + str.charAt(str.length() - 1)).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}


