package boj.step.char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p05622 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p05622.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] dials = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", ""};
        String str = st.nextToken();
        int seconds = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < dials.length; j++) {
                if (dials[j].contains(str.substring(i, i + 1))) {
                    seconds += j + 1;
                }
            }
        }
        System.out.println(seconds);

    }
}
