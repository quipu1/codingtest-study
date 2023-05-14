package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.*;

public class s2_p01874 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p01874.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            while (idx <= tmp) {
                stack.push(idx++);
                sb.append("+").append("\n");
            }
            //System.out.println(stack);
            if (stack.pop() == tmp) {
                sb.append("-").append("\n");
            }
            else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
