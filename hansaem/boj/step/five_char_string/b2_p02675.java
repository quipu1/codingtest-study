package boj.step.five_char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p02675 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p02675.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < tmp[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(tmp[0]); k++) {
                    sb.append(tmp[1].charAt(j));
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();

    }
}
