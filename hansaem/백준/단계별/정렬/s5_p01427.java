package 백준.단계별.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class s5_p01427 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p01427.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] array = st.nextToken().split("");
        Arrays.sort(array, Collections.reverseOrder());

        sb.append(String.join("", array));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
