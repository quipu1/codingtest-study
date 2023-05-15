package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p11005 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p11005.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int i = 0;
        while ( N / Math.pow(B, i) >= 1 ) { i++; }
        if (i > 0 ) i--;

        for (int j = i; j >= 0; j--) {
            int number = (int)(N / Math.pow(B, j));
            N = (int)(N % Math.pow(B, j));
            if (number >= 0 && number <= 9) sb.append(String.valueOf(number));
            else if (number >= 10 && number <= 35) sb.append((char)('A' + number - 10));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
