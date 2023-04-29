package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p02903 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p02903.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int vertex = 2;
        for (int i = 1; i <= N; i++) {
            vertex = 2 * vertex - 1;
        }

        bw.write(String.valueOf(vertex * vertex));
        bw.flush();
        bw.close();
    }
}
