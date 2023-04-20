package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int i=0; i<m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int idxI = Integer.parseInt(st2.nextToken()) - 1;
            int idxJ = Integer.parseInt(st2.nextToken()) - 1;
            int k = Integer.parseInt(st2.nextToken());

            for (int j=idxI; j<idxJ+1; j++) {
                basket[j] = k;
            }
        }

        bw.write(Arrays.toString(basket).replaceAll("[^0-9 ]", ""));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}