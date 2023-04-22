package boj.step.char_string;

import java.io.*;

public class b2_p10809 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p10809.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(str.indexOf(c)).append(" ");
        }
        bw.write(sb.toString());
        bw.close();

    }
}
