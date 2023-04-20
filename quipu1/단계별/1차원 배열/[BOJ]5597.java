package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> students = new ArrayList<>();

        for (int i=1; i<31; i++) {
            students.add(i);
        }

        for (int j=0; j<28; j++) {
            students.remove(Integer.valueOf(Integer.parseInt(br.readLine())));
        }

        Collections.sort(students);

        bw.write(String.valueOf(students.get(0)));
        bw.newLine();
        bw.write(String.valueOf(students.get(1)));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}