package 백준.단계별.시간복잡도;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p24313 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/시간복잡도/input/p24313.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1 < 0) sb.append("0");
        else sb.append((a1 * n0 + a0) <= c * n0 && c >= a1 ? "1" : "0");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
