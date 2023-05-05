package 백준.단계별.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p01436 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/브루트포스/input/p01436.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        int count = 0;
        int idx = 0;
        while (count < N) {
            idx += 1;
            if (String.valueOf(idx).contains("666")) count += 1;
            if (count == N) break;
        }
        sb.append(idx);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
