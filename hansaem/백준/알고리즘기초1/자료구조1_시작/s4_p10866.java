package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.*;

public class s4_p10866 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p10866.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        int inIdx = 0, outIdx = 0;
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push_front":
                    list.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                    list.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    if (!list.isEmpty()) sb.append(list.pollFirst()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "pop_back":
                    if (!list.isEmpty()) sb.append(list.pollLast()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if (list.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if (!list.isEmpty()) sb.append(list.getFirst()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "back":
                    if (!list.isEmpty()) sb.append(list.getLast()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
