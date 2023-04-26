package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i=0; i<tc; i++) {
            String[] words = br.readLine().split("");

            List<String> list = new ArrayList<>();
            list.add(words[0]);

            int a = 1;
            for (int j=1; j<words.length; j++) {
                if (!list.contains(words[j])) {
                    list.add(words[j]);
                } else if (!words[j].equals(words[j-1])) {
                    a = 0;
                    break;
                }
            }

            answer += a;
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