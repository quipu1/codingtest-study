package 백준.단계별.기하;

import java.io.*;
import java.util.StringTokenizer;

public class b3_p03009 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p03009.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        int x = 0, y = 0;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            x ^= Integer.parseInt(st.nextToken());
            y ^= Integer.parseInt(st.nextToken());
        }
        sb.append(x + " " + y);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
