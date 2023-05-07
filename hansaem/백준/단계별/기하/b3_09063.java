package 백준.단계별.기하;

import java.io.*;
import java.util.StringTokenizer;

public class b3_09063 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p09063.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int minX = 100001, minY = 100001;
        int maxX = -100001, maxY = -100001;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            minX = Math.min(minX, x); maxX = Math.max(maxX, x);
            minY = Math.min(minY, y); maxY = Math.max(maxY, y);
        }
        sb.append((maxX - minX) * (maxY - minY));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
