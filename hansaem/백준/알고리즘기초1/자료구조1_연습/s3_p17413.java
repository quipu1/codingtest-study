package 백준.알고리즘기초1.자료구조1_연습;

import java.io.*;

public class s3_p17413 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_연습/input/p17413.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        /**
         * (2) 방법
         */
        String input = br.readLine();
        StringBuilder word = new StringBuilder();
        StringBuilder output = new StringBuilder();
        boolean inTag = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '<') {
                inTag = true;
                output.append(word.reverse()).append(ch);
            } else if (ch == '>') {
                inTag = false;
                output.append(ch);
                word = new StringBuilder();
            } else if (inTag) {
                output.append(ch);
            } else {
                if (ch == ' ') {
                    output.append(word.reverse()).append(ch);
                    word = new StringBuilder();
                } else {
                    word.append(ch);
                }
            }
        }
        if (word.length() != 0) output.append(word.reverse());
        bw.write(output.toString());

        /**
         * (1) 방법
         */
//        String S = br.readLine();
//        Stack<String> stack = new Stack<>();
//        boolean inTag = false;
//        for (int i = 0; i < S.length(); i++) {
//            String tmp = S.substring(i, i + 1);
//            if (tmp.equals("<")) {
//                while (!stack.isEmpty()) {
//                    sb.append(stack.pop());
//                }
//                inTag = true;
//            } else if (tmp.equals(">")) {
//                inTag = false;
//                sb.append(tmp);
//                continue;
//            }
//
//            if (inTag) {
//                sb.append(tmp);
//            } else {
//                if (tmp.equals(" ")) {
//                    while (!stack.isEmpty()) sb.append(stack.pop());
//                    sb.append(" ");
//                    continue;
//                } else {
//                    stack.push(tmp);
//                }
//            }
//
//            if (i == S.length() - 1) {
//                while (!stack.isEmpty()) {
//                    sb.append(stack.pop());
//                }
//            }
//        }
//        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
