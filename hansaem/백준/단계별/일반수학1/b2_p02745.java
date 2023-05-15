package 백준.단계별.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p02745 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/일반수학1/input/p02745.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        // B진법 -> 수 N -> 10진법으로

        int decimal = 0;
        char[] chr = N.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            char ch = chr[i];
            int toNumber = 0;
            if (ch >= 'A' && ch <= 'Z') { toNumber = ch - 'A' + 10; }
            else if (ch >= '0' && ch <= '9') { toNumber = ch - '0'; }

            decimal += toNumber * Math.pow(B, chr.length - i - 1);
        }
        bw.write(String.valueOf(decimal));
        bw.flush();
        bw.close();
    }
}
