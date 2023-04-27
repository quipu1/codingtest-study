package 백준.단계별.조건문;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b5_p14681 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/two_if/input/p14681.txt")
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());

        if (x > 0) {
            if (y > 0) System.out.println("1");
            else if (y < 0) System.out.println("4");
        } else if (x < 0) {
            if (y > 0) System.out.println("2");
            else if (y < 0) System.out.println("3");
        }
    }
}
