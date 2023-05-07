package 백준.단계별.브루트포스;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b2_p02798 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/브루트포스/input/p02798.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> cardList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            cardList.add(Integer.parseInt(st.nextToken()));
        }

        int score = 0;
        for (int i = 0; i < cardList.size() - 2; i++) {
            for (int j = i + 1; j < cardList.size() - 1; j++) {
                for (int k = j + 1; k < cardList.size(); k++) {
                    int tmpScore = cardList.get(i) + cardList.get(j) + cardList.get(k);
                    if (tmpScore > M) continue;
                    if (M - tmpScore < M - score) score = tmpScore;
                }
            }
        }
        sb.append(score);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
