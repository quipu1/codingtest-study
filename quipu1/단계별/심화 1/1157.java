package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> word = Arrays.asList(br.readLine().toUpperCase().split(""));

        Set<String> set = new HashSet<>(word);
        List<String> list = new ArrayList<>(set);

        int max = -1;
        String maxStr = "";

        for (String s : list) {
            int n = Collections.frequency(word, s);

            if (n > max) {
                max = n;
                maxStr = s;
            } else if (n == max) {
                maxStr = "?";
            }
        }

        bw.write(maxStr);

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}