package boj.step.char_string;

import java.io.*;
import java.util.StringTokenizer;

public class b2_p01152 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/char_string/input/p01152.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] strings = br.readLine().split(" ");
        int count = 0;
        for (String s : strings) {
            if (s.isEmpty() != true) count += 1;
        }
        System.out.println(count);

        /*
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens);
        */
    }
}
