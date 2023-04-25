package 백준.단계별.심화1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * - 문제
 * 바구니 순서 바꾸기
 * <p>
 * - 예시)
 * 1 2 3 4 5 6 7 8 9 10
 * s   m       e
 * m       e        s
 * 3 4 5 6 7 8 9 10 1 2
 */

public class b2_p10812 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p10812.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < M; i++) {
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());

            System.out.println("start: " + start + ", mid: " + mid + ", end: " + end);
            for (int j = 0; j < start - 1; j++) list.add(array[j]);
            for (int j = mid - 1; j < end - 1; j++) list.add(array[j]);
            for (int j = start - 1; j < mid - 1; j++) list.add(array[j]);
            for (int j = end - 1; j <= N - 1; j++) list.add(array[j]);

            //System.out.println(Arrays.toString(array));
            System.out.println(list.toString() + "\n");
            array = list.stream().mapToInt(m -> m).toArray();
        }
        bw.write(Arrays.toString(array));
        bw.close();
    }
}
