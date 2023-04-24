package 백준.단계별.문자열;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p11654 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p11654.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = String.valueOf(st.nextToken());
        System.out.println((int) str.charAt(0));
    }
}
