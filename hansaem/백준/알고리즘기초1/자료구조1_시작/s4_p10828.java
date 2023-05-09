package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s4_p10828 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p10828.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] stack = new int[N + 1];
        int pc = -1;
        for (int i = 0; i < N; i++) {
            String[] op = br.readLine().split(" ");
            switch (op[0]) {
                case "push":
                    pc += 1;
                    stack[pc] = Integer.parseInt(op[1]);
                    break;
                case "pop":
                    if (pc == -1) {
                        sb.append(-1).append("\n");
                        break;
                    } else {
                        sb.append(stack[pc]).append("\n");
                        pc -= 1;
                        break;
                    }
                case "size":
                    sb.append(pc + 1).append("\n");
                    break;
                case "empty":
                    if (pc >= 0) sb.append(0).append("\n");
                    else sb.append(1).append("\n");
                    break;
                case "top":
                    if (pc == -1) sb.append(-1).append("\n");
                    else sb.append(stack[pc]).append("\n");
                    break;
            }
            System.out.println(Arrays.toString(stack) + ", " + pc);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
