package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class s4_p01158 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p01158.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int K = Integer.parseInt(st.nextToken());

        sb.append("<");
        int idx = -1;
        int n = N;
        int k = K;
        for (int i = 1; i <= N; i++) {
            idx = (idx + k) % n;
            sb.append(list.get(idx));
            list.remove(idx);
            n -= 1;
            k = K - 1;
            if (i < N) sb.append(", ");
        }
        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
