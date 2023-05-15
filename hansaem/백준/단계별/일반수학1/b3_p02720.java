package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p02720 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p02720.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());
            sb.append(String.valueOf(money / 25) + " "); money %= 25;
            sb.append(String.valueOf(money / 10) + " "); money %= 10;
            sb.append(String.valueOf(money / 5) + " "); money %= 5;
            sb.append(String.valueOf(money / 1)).append("\n"); money %= 1;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
