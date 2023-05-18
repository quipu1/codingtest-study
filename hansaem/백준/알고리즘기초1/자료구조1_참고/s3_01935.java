package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.*;

public class s3_01935 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p01935.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        String input = br.readLine();
        Stack<Double> stack = new Stack<>();
        Map<Character, Double> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put((char)('A' + i), Double.parseDouble(br.readLine()));
        }
        for (int i = 0; i < input.length(); i++) {
            char op = input.charAt(i);
            if (op >= 'A' && op <= 'Z') {
                stack.push(map.get(op));
            } else if (op == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if (op == '-') {
                double tmp = stack.pop();
                stack.push(stack.pop() - tmp);
            } else if (op == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if (op == '/') {
                double tmp = stack.pop();
                stack.push(stack.pop() / tmp);
            }
        }
        double answer = stack.pop();
        String output = String.format("%.2f", answer);

        bw.write(output);
        bw.flush();
        bw.close();
    }
}
