package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arrayA = new ArrayList<>();
        List<Integer> arrayB = new ArrayList<>();


        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayA.add(Integer.parseInt(st.nextToken()));
            arrayB.add(Integer.parseInt(st.nextToken()));
        }

        for (int a : arrayA) {
            if (Collections.frequency(arrayA, a) == 1) {
                bw.write(a + " ");
            }
        }

        for (int b : arrayB) {
            if (Collections.frequency(arrayB, b) == 1) {
                bw.write(String.valueOf(b));
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