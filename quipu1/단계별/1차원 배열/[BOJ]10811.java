package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> baskets = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            baskets.add(i);
        }

        for (int j=0; j<m; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int idxI = Integer.parseInt(st2.nextToken()) - 1;
            int idxJ = Integer.parseInt(st2.nextToken()) - 1;

            List<Integer> sub = baskets.subList(idxI, idxJ+1);
            Collections.reverse(sub);

            int idx = 0;
            for (int k=idxI; k<idxJ; k++) {
                baskets.set(k, sub.get(idx));
                idx += 1;
            }
        }

        bw.write(String.valueOf(baskets).replaceAll("[^0-9 ]", ""));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}