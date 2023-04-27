package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class b1_p01157 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p01157.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] alp = new int[26];

        String str = st.nextToken().toUpperCase();
        int max = 0;
        char ch = '?';
        System.out.println("str: " + str);
        for (char c : str.toCharArray()) {
            int index = c - 'A';
            alp[index] += 1;
            if (alp[index] > max) {
                max = alp[index];
                ch = c;
            }
        }
        //System.out.println("max: " + max);
        int count = 0;
        for (int i = 0; i < alp.length; i++) {
            if (alp[i] == max) count += 1;
        }
        if (count > 1) System.out.print("?");
        else System.out.print(ch);
        bw.close();
    }
}
