package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p10824 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p10824.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long num01 = 0;
        long num02 = 0;
        num01 = Long.parseUnsignedLong(st.nextToken() + st.nextToken());
        num02 = Long.parseUnsignedLong(st.nextToken() + st.nextToken());
        sb.append(num01 + num02);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
