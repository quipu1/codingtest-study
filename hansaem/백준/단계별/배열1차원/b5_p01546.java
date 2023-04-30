package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p01546 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p01546.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            double[] scores = new double[N];
            double max = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                if (max < scores[i]) max = scores[i];
            }

            double sum = 0;
            for (int i = 0; i < N; i++) {
                scores[i] = scores[i] / max * 100;
                sum += scores[i];
            }

            System.out.println(Math.round(sum / N * 1000000) / 1000000.0);

        }
    }
}
