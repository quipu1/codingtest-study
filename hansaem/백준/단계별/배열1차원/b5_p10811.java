package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p10811 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p10811.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) array[i] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = 0; j <= (end - start) / 2; j++) {
                int tmp = array[start + j];
                array[start + j] = array[end - j];
                array[end - j] = tmp;
            }
            //for (int j = 1; j <= N; j++) System.out.print(array[j] + " ");
            //System.out.println();
        }

        for (int i = 1; i <= N; i++) System.out.print(array[i] + " ");
    }
}
