package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p10818 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p10871.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int min = 1000001;
        int max = -1000001;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int ele = Integer.parseInt(st.nextToken());
            if (min > ele) min = ele;
            if (max < ele) max = ele;
        }
        System.out.println(min + " " + max);
    }
}
