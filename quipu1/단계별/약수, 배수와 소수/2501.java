package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                list.add(i);
                if (n/i != i){
                    list.add(n/i);
                }
            }
        }

        if (list.size() < k) {
            bw.write("0");
        } else {
            Collections.sort(list);
            bw.write(String.valueOf(list.get(k-1)));
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}