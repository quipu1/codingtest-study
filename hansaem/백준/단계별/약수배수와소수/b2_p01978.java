package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p01978 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p01978.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) continue;
            if (num == 2) {
                count += 1; continue;
            }
            boolean primeFlag = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    primeFlag = false;
                    break;
                }
            }
            if (primeFlag) count += 1;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
