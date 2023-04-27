package 백준.단계별.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p10807 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/four_one_dim_array/input/p10807.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String tmpST;

        //int N = Integer.parseInt(st.nextToken());
        while ((tmpST = br.readLine()) != null) {
            st = new StringTokenizer(tmpST);
            int N = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(br.readLine());
            int answer = 0;
            for (int i = 0; i < N; i++) {
                if (V == Integer.parseInt(st.nextToken())) answer += 1;
            }
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.close();

    }
}
