package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p11653 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p11653.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (true) {
            boolean exit = true;
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    sb.append(i).append("\n");
                    N /= i;
                    exit = false;
                    break;
                }
            }
            if (exit) break;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
