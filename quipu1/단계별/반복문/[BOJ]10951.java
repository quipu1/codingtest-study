package basic;

import java.io.*;
import java.util.*;
public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();

            //백준에서는 파일 자체가 들어와서 앞의 조건만으로도 break 가능
            //ide에서는 입력값의 끝(eof)가 어디인지 몰라서 실행못하고 있음
            //따라서, 두번째 조건까지 추가해줘야 코드가 돌아감
            if (str == null || str.isEmpty()) {
                break;
            }

            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(a+b));
            bw.newLine();

        }

        bw.flush();
        br.close();
        bw.close();

    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}