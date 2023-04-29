package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a==0 && b==0) {
                break;
            }

            if (a/b>0 && a%b==0) {
                bw.write("multiple");
                bw.newLine();
            } else if (b/a>0 && b%a==0) {
                bw.write("factor");
                bw.newLine();
            } else {
                bw.write("neither");
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}