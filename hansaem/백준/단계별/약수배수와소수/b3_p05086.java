package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class b3_p05086 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p05086.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            if (X == 0) break;

            if (X % Y == 0) sb.append("multiple");
            else if (X % Y > 0 && Y % X == 0) sb.append("factor");
            else sb.append("neither");
            sb.append("\n");

            // ans = Y % X == 0 ? "factor" : X % Y == 0 ? "multiple" : "neither";
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
