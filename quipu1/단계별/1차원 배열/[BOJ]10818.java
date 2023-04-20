package basic;

import java.io.*;
import java.util.*;
public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] nums = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);

        bw.write(nums[0] + " " + nums[n-1]);

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}