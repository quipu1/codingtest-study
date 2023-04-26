package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int i = 1;
        int max = 0;
        while(x > max) {
            max += i;
            i += 1;
        }

        int a,b;
        if ((i-1)%2 == 0){
            a = x-(max-(i-1));
            b = i - a;
        } else {
            b = x-(max-(i-1));
            a = i - b;
        }

        bw.write(a + "/" + b);

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}