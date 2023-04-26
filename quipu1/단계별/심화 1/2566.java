package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = -1;
        int n = 0;
        int m = 0;
        for (int i=1; i<10; i++) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j=1; j<10; j++){
                if (nums[j-1] > maxNum){
                    maxNum = nums[j-1];
                    n = i;
                    m = j;
                }
            }
        }

        bw.write(String.valueOf(maxNum));
        bw.newLine();
        bw.write(n + " " + m);

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}