package 백준.단계별.정렬;

import java.io.*;
import java.util.*;

public class b2_p25305 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p25305.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] scores = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] array = Arrays.stream(scores).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        sb.append(array[k - 1]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
