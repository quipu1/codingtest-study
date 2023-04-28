package 백준.단계별.배열2차원;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p02563 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/배열2차원/input/p02563.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int[][] usePaper = new int[101][101];
        int sum = 0;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int v = x; v < 10 + x; v++) {
                for (int k = y; k < 10 + y; k++) {
                    if (usePaper[v][k] == 0) {
                        usePaper[v][k] = 1;
                        sum += 1;
                    }
                }
            }

        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
