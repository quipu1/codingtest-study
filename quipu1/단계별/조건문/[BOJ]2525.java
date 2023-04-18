package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int quotient = c/60;
        int remainder = c%60;

        int h = a + quotient;
        int m = b + remainder;

        if (m < 60) {
            if (h <= 23) {
                bw.write(h + " " + m);
            } else {
                bw.write((h-24) + " " + m);
            }
        } else {
            if (h+1 <= 23) {
                bw.write((h+1) + " " + (m-60));
            } else {
                bw.write((h-23) + " " + (m-60));
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