package 백준.단계별.정렬;

import java.io.*;
import java.util.*;

public class s5_p01181 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p01181.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) return s1.compareTo(s2);
                return s1.length() - s2.length();
            }
        });
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for (String s : set) {
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
