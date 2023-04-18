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
        int c = Integer.parseInt(st.nextToken());
        int array[] = {a, b, c};

        if (a != b && b != c && c != a) {
            Arrays.sort(array);
            bw.write(String.valueOf(100 * array[2]));
        } else if (a == b && b == c && c == a) {
            bw.write(String.valueOf(10000 + a * 1000));
        } else {
            if (a == b) {
                bw.write(String.valueOf(1000 + a*100));
            } else if (b == c) {
                bw.write(String.valueOf(1000 + b*100));
            } else {
                bw.write(String.valueOf(1000 + c*100));
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