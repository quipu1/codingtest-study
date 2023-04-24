package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p03052 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p03052.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] visit = new int[42];

        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str) % 42;
            visit[num] += 1;
        }

        int sum = 0;
        for (int i = 0; i < 42; i++) {
            if (visit[i] > 0) sum += 1;
        }
        System.out.println(sum);
    }
}
