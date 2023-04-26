package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15];

        for (int i=0; i<5; i++) {
            String[] words = br.readLine().split("");

            for (int j=0; j<words.length; j++) {
                arr[i][j] = words[j];
            }
        }

        for (int n=0; n<15; n++) {
            for (int m=0; m<5; m++) {
                if (arr[m][n] != null){
                    bw.write(arr[m][n]);
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}