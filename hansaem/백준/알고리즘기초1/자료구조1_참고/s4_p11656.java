package 백준.알고리즘기초1.자료구조1_참고;

import java.io.*;
import java.util.Arrays;

public class s4_p11656 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_참고/input/p11656.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] array = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            array[i] = input.substring(i);
        }
        Arrays.sort(array);
        for (int i = 0; i < input.length(); i++) {
            sb.append(array[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
