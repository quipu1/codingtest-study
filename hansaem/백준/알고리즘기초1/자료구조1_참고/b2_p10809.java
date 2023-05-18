package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b2_p10809 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p10809.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            map.put(key, map.getOrDefault(key, i));
        }
        for (int i = 0; i < 26; i++) {
            char key = (char)('a' + i);
            map.put(key, map.getOrDefault(key, -1));
        }

        for (int i = 0; i < map.size(); i++) {
            sb.append(map.get((char)('a' + i)) + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
