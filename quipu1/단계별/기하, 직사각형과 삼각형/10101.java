package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a==60 && a==b && b==c && c==a) {
            bw.write("Equilateral");
        } else if (a+b+c==180 && (a==b || b==c || c==a)) {
            bw.write("Isosceles");
        } else if (a+b+c==180 && a!=b && b!=c && c!=a) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}