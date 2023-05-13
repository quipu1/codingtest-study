package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<String> que = new LinkedList<>();
        String last = "";

        for (int i=0; i<n; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push")) {
                que.offer(cmd[1]);
                last = cmd[1];
            } else if (cmd[0].equals("pop")) {
                if (que.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(que.poll());
                }
                bw.newLine();
            } else if (cmd[0].equals("size")) {
                bw.write(String.valueOf(que.size()));
                bw.newLine();
            } else if (cmd[0].equals("empty")) {
                if (que.isEmpty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.newLine();
            } else if (cmd[0].equals("front")) {
                if (que.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(que.peek());
                }
                bw.newLine();
            } else if (cmd[0].equals("back")) {
                if (que.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(last);
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