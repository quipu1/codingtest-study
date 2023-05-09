package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class s4_p09012 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p09012.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            String[] array = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            boolean isComp = true;
            for (String s : array) {
                if (s.equals("(")) stack.push(")");
                else {
                    if (!stack.empty()) stack.pop();
                    else {
                        isComp = false;
                        break;
                    }
                }
            }
            if (!isComp) sb.append("NO").append("\n");
            else {
                if (stack.empty()) sb.append("YES").append("\n");
                else sb.append("NO").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
