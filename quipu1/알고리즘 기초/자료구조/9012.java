package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            Stack<String> stack = new Stack<>();
            String[] ps = br.readLine().split("");
            String answer = "YES";

            for (String p : ps) {
                if (p.equals("(")) {
                    stack.push("(");
                } else if (p.equals(")")) {
                    if (stack.empty()) {
                        answer = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.empty()) {
                answer = "NO";
            }

            bw.write(answer);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}