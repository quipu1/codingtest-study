package 백준.단계별.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class b3_p02588 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/boj/step/one_io_arithmetics/input/p02588.txt")
        );

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(b % 10 * a);
        System.out.println(b / 10 % 10 * a);
        System.out.println(b / 100 % 10 * a);
        System.out.println(a * b);
    }
}
