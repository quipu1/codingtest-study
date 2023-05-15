package basic;

import java.io.*;
import java.util.Stack;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");
        int m = Integer.parseInt(br.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for (String s : str) {
            left.push(s);
        }

        for (int i=0; i<m; i++) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            if (c == 'L' && !left.empty()) {
                right.push(left.pop());
            } else if (c == 'D' && !right.empty()) {
                left.push(right.pop());
            } else if (c == 'B' && !left.empty()) {
                left.pop();
            } else if (c == 'P') {
                left.push(String.valueOf(cmd.charAt(2)));
            }
        }

        while (!right.empty()) {
            left.push(right.pop());
        }

        bw.write(left.toString().replaceAll("[^a-z]", ""));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}