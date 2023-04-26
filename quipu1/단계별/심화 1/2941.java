package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] crotia = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int answer = 0;
        String[] words = br.readLine().split("");
        for (int i=0; i< words.length; i++) {
            if (i<words.length-1 && Arrays.asList(crotia).contains(words[i] + words[i+1])) {
                answer += 1;
                i += 1;
            } else if (i<words.length-2 && (words[i] + words[i+1] + words[i+2]).equals("dz=")) {
                answer += 1;
                i += 2;
            } else {
                answer += 1;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}