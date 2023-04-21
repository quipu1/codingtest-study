package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] nums = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        bw.write(String.valueOf(Arrays.stream(nums).sum()));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}