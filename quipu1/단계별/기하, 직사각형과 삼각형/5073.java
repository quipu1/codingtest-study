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
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int[] arrays = {a, b, c};
            Arrays.sort(arrays);

            if (arrays[2] >= arrays[0] + arrays[1]) {
                bw.write("Invalid");
            } else if (arrays[0] == arrays[1] && arrays[1] == arrays[2]) {
                bw.write("Equilateral");
            } else if (arrays[0] != arrays[1] && arrays[1] != arrays[2] && arrays[2] != arrays[0]) {
                bw.write("Scalene");
            } else {
                bw.write("Isosceles");
            }

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