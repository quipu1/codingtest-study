package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        List<String> answer = new ArrayList<>();
        boolean flag = true;

        //넣을 번호 차례
        int now = 1;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (now > num) {
                if (stack.pop() != num) {
                    flag = false;
                    break;
                } else {
                    answer.add("-");
                }
            } else {
                for (int j=now; j<=num; j++) {
                    stack.push(j);
                    answer.add("+");
                }
                stack.pop();
                answer.add("-");
                now = num + 1;
            }
        }

        if (flag) {
            for (String a : answer) {
                bw.write(a);
                bw.newLine();
            }
        } else {
            bw.write("NO");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}