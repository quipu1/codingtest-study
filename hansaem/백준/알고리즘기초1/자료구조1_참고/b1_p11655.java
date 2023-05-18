package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p11655 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p11655.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (ch + 13 > 'Z') {
                    ch = (char)(ch - 13);
                } else {
                    ch = (char)(ch + 13);
                }

            } else if (Character.isLowerCase(ch)) {
                if (ch + 13 > 'z') {
                    ch = (char)(ch - 13);
                } else {
                    ch = (char)(ch + 13);
                }
            }
            sb.append(ch);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
