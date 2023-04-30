package 백준.단계별.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class s5_p01316 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p01316.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int start = str.indexOf(ch);
                int end = str.lastIndexOf(ch);

                String tmp = str.substring(start, end + 1);
                j += tmp.length() - 1;
                tmp = tmp.replace(String.valueOf(ch), "");
                if (!tmp.isEmpty()) {
                    check = false;
                    break;
                }
            }
            if (check) count += 1;
        }
        System.out.println(count);

        bw.close();
    }
}
