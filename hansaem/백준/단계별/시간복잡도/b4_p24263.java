package 백준.단계별.시간복잡도;

import java.io.*;
import java.util.StringTokenizer;

public class b4_p24263 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p24263.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        sb.append(n).append("\n").append("1");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
