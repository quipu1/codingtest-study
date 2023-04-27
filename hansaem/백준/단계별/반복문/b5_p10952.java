package 백준.단계별.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p10952 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/three_loop/input/p10952.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;//new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while ((st = new StringTokenizer(br.readLine())) != null) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;

            sb.append((a + b) + "\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
