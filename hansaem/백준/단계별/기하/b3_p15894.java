package 백준.단계별.기하;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p15894 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p15894.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long n = Integer.parseInt(br.readLine());
        sb.append(4 * n);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
