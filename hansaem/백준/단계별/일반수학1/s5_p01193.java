package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p01193 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p01193.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(st.nextToken());
        int step = 1;
        int sum = 0, prev = 0;
        while (step > 0) {
            prev = sum;
            sum += step;
            if (prev < X && X <= sum) break;
            step += 1;
        }

        sum = step + 1;
        int row = 1, col = 1;
        for (int i = 1; i <= step; i++) {
            int j = sum - i;
            if (X == prev + i) {
                if (step % 2 == 1) { row = j; col = i; break; }
                else { row = i; col = j; break; }
            }
        }

        bw.write(String.valueOf(row + "/" + col));
        bw.flush();
        bw.close();
    }
}
