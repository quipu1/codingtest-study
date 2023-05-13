package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b3_p02501 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p02501.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                list.add(i);
                if (N / i != i) list.add(N / i);
            }
        }
        Collections.sort(list);
        if (N == 1) list.add(1);
        sb.append(list.size() > K - 1 ? list.get(K - 1) : "0");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
