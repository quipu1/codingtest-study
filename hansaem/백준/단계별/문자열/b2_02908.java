package 백준.단계별.문자열;

import java.io.*;
import java.util.StringTokenizer;

public class b2_02908 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p02908.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = new StringBuilder(st.nextToken());
        StringBuilder sb2 = new StringBuilder(st.nextToken());

        int num1 = Integer.parseInt(sb1.reverse().toString());
        int num2 = Integer.parseInt(sb2.reverse().toString());

        System.out.println(Math.max(num1, num2));
    }
}
