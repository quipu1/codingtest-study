package boj.step.five_char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p27866 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p27866.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = String.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        System.out.println(str.charAt(num - 1));
    }
}
