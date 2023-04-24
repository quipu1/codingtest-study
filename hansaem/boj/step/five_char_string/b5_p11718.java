package boj.step.five_char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p11718 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p11718.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
