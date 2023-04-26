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

        int[][] arrayA = new int[n][m];
        int[][] arrayB = new int[n][m];

        for (int i=0; i<2*n; i++) {
            if (i<n) {
                arrayA[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            } else {
                arrayB[i-n] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
        }

        int[][] result = new int[n][m];
        for (int a=0; a<n; a++) {
            for (int b=0; b<m; b++) {
                result[a][b] = arrayA[a][b] + arrayB[a][b];
                bw.write(result[a][b] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}