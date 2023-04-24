package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i=0; i<tc; i++) {
            int[] students = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            float allNum = students[0];
            float average = (Arrays.stream(students).sum() - allNum) / allNum;

            float num = 0;
            for (int j=1; j<students.length; j++) {
                if (students[j] > average) {
                    num += 1;
                }
            }

            bw.write(String.format("%.3f", num/allNum*100) + "%");
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