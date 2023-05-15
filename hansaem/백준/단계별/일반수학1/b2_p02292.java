package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p02292 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p02292.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int step = 1;
        while (N > 0) {
            if (step == 1) N = N - 6 * (step - 1) - 1;
            else N = N - 6 * (step - 1);
            step += 1;
        }
        bw.write(String.valueOf(step - 1));
        bw.flush();
        bw.close();
    }
}
