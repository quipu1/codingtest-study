package basic;

import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque<>();
        
        for (int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            
            if (str[0].equals("push_front")) {
                deque.addFirst(str[1]);
            } else if (str[0].equals("push_back")) {
                deque.addLast(str[1]);
            } else if (str[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(deque.pollFirst());
                }
                bw.newLine();
            } else if (str[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(deque.pollLast());
                }
                bw.newLine();
            } else if (str[0].equals("size")) {
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (str[0].equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.newLine();
            } else if (str[0].equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(deque.peekFirst());
                }
                bw.newLine();
            } else if (str[0].equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(deque.peekLast());
                }
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}