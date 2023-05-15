package 백준.단계별.배열2차원;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1_p10798 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/배열2차원/input/p10798.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[][] array = new String[5][15];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String[] tmp = st.nextToken().split("");
            Arrays.fill(array[i], "");
            for (int j = 0; j < tmp.length; j++) {
                array[i][j] = tmp[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(array[j][i]);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
