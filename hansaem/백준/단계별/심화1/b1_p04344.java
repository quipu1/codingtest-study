package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p04344 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p04344.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(st.nextToken());
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double avg = sum / (double)N;
            double out = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) out += 1;
            }
            out /= N;
            System.out.println(String.format("%.3f" + "%%", out * 100));
        }

        bw.close();
    }
}
