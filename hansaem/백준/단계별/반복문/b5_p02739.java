package 백준.단계별.반복문;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b5_p02739 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/three_loop/input/p02739.txt")
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}
