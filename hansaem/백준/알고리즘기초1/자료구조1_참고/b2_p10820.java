package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b2_p10820 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p10820.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input;
        while ((input = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int space = 0;
            int number = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) upper++;
                if (Character.isLowerCase(c)) lower++;
                if (Character.isDigit(c)) number++;
            }
            sb.append(lower + " " + upper + " " + number + " " + space + "\n");
//            Map<String, Integer> map = new HashMap<>();
//            map.put("lower", 0);
//            map.put("upper", 0);
//            map.put("space", 0);
//            map.put("number", 0);
//            for (int i = 0; i < input.length(); i++) {
//                char ch = input.charAt(i);
//                if (ch >= 'a' && ch <= 'z') map.put("lower", map.getOrDefault("lower", 0) + 1);
//                else if (ch >= 'A' && ch <= 'Z') map.put("upper", map.getOrDefault("upper", 0) + 1);
//                else if (ch == ' ') map.put("space", map.getOrDefault("space", 0) + 1);
//                else if (ch >= '0' && ch <= '9') map.put("number", map.getOrDefault("number", 0) + 1);
//            }
//
//            sb.append(map.get("lower") + " " + map.get("upper") + " " + map.get("number") + " " + map.get("space")).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
