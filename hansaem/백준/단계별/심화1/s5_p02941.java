package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p02941 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p02941.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] after = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = st.nextToken();
        int length = after.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            String tmp = after[i];
            //System.out.println(tmp + " -> " + str.contains(tmp));
            while (str.contains(tmp)) {
                count += 1;
                str = str.replaceFirst(tmp, "0");
            }
        }
        str = str.replaceAll("0", "");
        System.out.println(count + str.length());

        bw.close();
    }
}
