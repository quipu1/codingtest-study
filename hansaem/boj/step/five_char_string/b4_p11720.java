package boj.step.five_char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b4_p11720 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p11720.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            int sum = 0;
            String S = br.readLine();
            String[] as = S.split("");
            for (int i = 0; i < N; i++) {
                sum += Integer.parseInt(as[i]);
            }
            sb.append(sum).append("\n");
        }
        bw.write(sb.toString());
        bw.close();

    }
}
