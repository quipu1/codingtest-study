package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p02562 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p02562.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        int max = 0;
        int line = 1, count = 1;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int tmp = Integer.parseInt(st.nextToken());
            if (max < tmp) {
                max = tmp;
                line = count;
            }
            count += 1;
        }
        System.out.println(max + "\n" + line);
    }
}
