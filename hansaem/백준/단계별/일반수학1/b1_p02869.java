package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p02869 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p02869.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = 0;
        if (A != V) {
            day = (V - A) / (A - B);
            if (day == 0) day = 1;
            int m = day * (A - B);

            while (day++ > 0) {
                m += A;
                if (m >= V) break;
                m -= B;
            }
        } else day = 1;

        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
