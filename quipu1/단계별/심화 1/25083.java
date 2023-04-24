package basic;

import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7");
        bw.newLine();
        bw.write("r`-_   ,'  ,/");
        bw.newLine();
        bw.write(" \\. \". L_r'");
        bw.newLine();
        bw.write("   `~\\/");
        bw.newLine();
        bw.write("      |");
        bw.newLine();
        bw.write("      |");
        bw.newLine();

        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}