package 백준.단계별.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s5_p11651 {
    public static class Point implements Comparable<s5_p11651.Point> {
        private int x;
        private int y;

        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX (int x) { this.x = x; }
        public void setY (int y) { this.y = y; }

        public int getX () { return x; }
        public int getY () { return y; }

        @Override
        public int compareTo(s5_p11651.Point o) {
            if (o.getY() == getY()) return getX() - o.getX();
            else return getY() - o.getY();
        }

        @Override
        public String toString() {
            return "x: " + x + ", y: " + y;
        }
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p11651.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        s5_p11651.Point[] points = new s5_p11651.Point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new s5_p11651.Point(x, y);
        }
//        for (int i = 0; i < N; i++) {
//            System.out.println(points[i].toString());
//        }
        Arrays.sort(points);
        for (int i = 0; i < N; i++) {
            //System.out.println(points[i].toString());
            sb.append(points[i].getX() + " " + points[i].getY()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
