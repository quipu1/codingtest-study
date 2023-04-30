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
        List<Integer> basket = new ArrayList<>();

        for (int b=0; b<n; b++) {
            basket.add(b+1);
        }

        for (int i=0; i<m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int idxI = Integer.parseInt(st2.nextToken()) - 1;
            int idxJ = Integer.parseInt(st2.nextToken()) - 1;
            int idxK = Integer.parseInt(st2.nextToken()) - 1;

            List<Integer> sub1 = new ArrayList<>(basket.subList(idxI, idxK));
            List<Integer> sub2 = new ArrayList<>(basket.subList(idxK, idxJ+1));
            sub2.addAll(sub1);

            int idx = 0;
            for (int j=idxI; j<idxJ+1; j++) {
                basket.set(j, sub2.get(idx));
                idx += 1;
            }

        }

        bw.write(basket.toString().replaceAll("[^0-9 ]", ""));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}