package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.StringTokenizer;

public class s4_p10845 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p10845.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] queue = new int[N];
        int inIdx = 0;
        int outIdx = 0;
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push":
                    queue[inIdx] = Integer.parseInt(str[1]);
                    inIdx += 1;
                    break;
                case "pop":
                    if (inIdx - outIdx == 0) sb.append("-1").append("\n");
                    else {
                        sb.append(queue[outIdx]).append("\n");
                        outIdx += 1;
                    }
                    break;
                case "size":
                    sb.append(inIdx - outIdx).append("\n");
                    break;
                case "empty":
                    if (inIdx - outIdx == 0) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if (inIdx - outIdx == 0) sb.append("-1").append("\n");
                    else sb.append(queue[outIdx]).append("\n");
                    break;
                case "back":
                    if (inIdx - outIdx == 0) sb.append("-1").append("\n");
                    else sb.append(queue[inIdx - 1]).append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
