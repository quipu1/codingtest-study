package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p02581 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p02581.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 10001;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i == 1) continue;
            if (i == 2) isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (min > i) min = i;
                sum += i;
            }
        }

        if (sum != 0) bw.write(sum + "\n" + min);
        else bw.write(String.valueOf(-1));
        bw.flush();
        bw.close();
    }
}
