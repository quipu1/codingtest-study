package 백준.알고리즘기초1.자료구조1_연습;

import java.io.*;
import java.util.Stack;

public class s2_p10799 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_연습/input/p10799.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();
                if (input.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
