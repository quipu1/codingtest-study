package 백준.단계별.배열2차원;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p02566 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/배열2차원/input/p02566.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int row = 1, col = 1;
        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int ele = Integer.parseInt(st.nextToken());
                if (max < ele) {
                    max = ele;
                    row = i;
                    col = j;
                }
            }
        }
        sb.append(max).append("\n").append(row + " " + col);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
