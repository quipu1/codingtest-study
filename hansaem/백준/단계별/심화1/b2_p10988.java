package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p10988 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p10988.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(st.nextToken());
        StringBuilder sbR = new StringBuilder(sb);
        sbR.reverse();

        System.out.println(sb.toString() + " , " + sbR.toString());

        int answer = 0;
        if (sb.compareTo(sbR) == 0) answer = 1;

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}
