package 백준.단계별.시간복잡도;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p24265 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/시간복잡도/input/p24265.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long n = Integer.parseInt(st.nextToken());

        sb.append((n - 1) * n / 2).append("\n").append("2");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
