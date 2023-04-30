package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * - 문제
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 * <p>
 * - 기록
 * st.nextToken()로 빼낼 때마다 st.countTokens()
 * for (int i = 0; i < st.countTokens(); i++) { }
 */
public class b5_p03003 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p03003.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] pieces = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < pieces.length; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(pieces[i] - tmp).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
