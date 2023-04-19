package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int price = 0;

        for (int i=0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            price += a*b;
        }

        if (x == price) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        br.close();
        bw.close();

    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}