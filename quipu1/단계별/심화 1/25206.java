package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        float average = 0; //학점*과목평점
        float credit = 0; //학점 총합
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] scores = input.split(" ");
            if (map.containsKey(scores[2])) {
                credit += Float.parseFloat(scores[1]);
                average += map.get(scores[2]) * Float.parseFloat(scores[1]);
            }
        }

        bw.write(String.valueOf(average/credit));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}