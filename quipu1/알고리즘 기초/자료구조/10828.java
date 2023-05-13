package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for (int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");

            if (str[0].equals("push")) {
                stack.push(str[1]);
            } else if (str[0].equals("pop")) {
                if (stack.empty()) {
                    bw.write("-1");
                } else {
                    bw.write(stack.pop());
                }
                bw.newLine();
            } else if (str[0].equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (str[0].equals("empty")) {
                if (stack.empty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.newLine();
            } else {
                if (stack.empty()) {
                    bw.write("-1");
                } else {
                    bw.write(stack.peek());
                }
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}