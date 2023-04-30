package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            for (int i=1; i<=Math.sqrt(n); i++) {
                if (n%i==0) {
                    list.add(i);
                    if (n/i != i && n!=n/i){
                        list.add(n/i);
                    }
                }
            }

            if (list.stream().mapToInt(Integer::intValue).sum() == n) {
                Collections.sort(list);
                bw.write(n + " = " + list.get(0));
                for (int j=1; j<list.size(); j++) {
                    bw.write(" + " + list.get(j));
                }
                bw.newLine();
            } else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}