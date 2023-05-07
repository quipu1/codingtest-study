package 백준.단계별.시간복잡도;

import java.io.*;
import java.util.StringTokenizer;

public class b5_p24262 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p05073.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("1").append("\n").append("0");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
