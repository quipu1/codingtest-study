package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];

        for (int t=0; t<tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int i=n; i<n+10; i++) {
                for (int j=m; j<m+10; j++) {
                    paper[i][j] = 1;
                }
            }
        }

        int answer = 0;
        for (int a=0; a<100; a++) {
            for (int b=0; b<100; b++) {
                answer += paper[a][b];
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}