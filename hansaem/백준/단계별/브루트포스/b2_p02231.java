package 백준.단계별.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p02231 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/브루트포스/input/p02231.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int min = 1000001;
        for (int i = 1; i <= N; i++) {
            int sum = i;
//            String[] numArrays = String.valueOf(i).split("");
//            for (int j = 0; j < numArrays.length; j++) {
//                sum += Integer.parseInt(numArrays[j]);
//            }
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp = tmp / 10;
            }
            if (sum == N) {
                min = i;
                break;
            }
        }
        if (min == 1000001) sb.append("0");
        else sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
