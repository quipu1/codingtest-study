package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> nums = new HashSet<>();

        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            nums.add(num%42);
        }

        bw.write(String.valueOf(nums.size()));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}