package 백준.단계별.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2_p02750 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p02750.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
