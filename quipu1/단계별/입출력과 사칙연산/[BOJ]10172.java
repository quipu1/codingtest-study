package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine();
        bw.write("|q p|   /}");
        bw.newLine();
        bw.write("( 0 )\"\"\"\\");
        bw.newLine();
        bw.write("|\"^\"`    |");
        bw.newLine();
        bw.write("||_/=\\\\__|");

        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}