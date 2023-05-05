package 백준.단계별.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p01436 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/브루트포스/input/p01436.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        int count = 0;
        if (N % 5 == 0) sb.append(N / 5);
        else {
            int maxFive = N / 5;
            for (int i = maxFive; i >= 0; i--) {
                int tmp = N - 5 * i;
                if (tmp % 3 == 0) {
                    count = i + tmp / 3;
                    break;
                }
                //System.out.println(i + ", " + tmp + ", "+ count);
            }
            if (count == 0) count = -1;
            sb.append(count);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
