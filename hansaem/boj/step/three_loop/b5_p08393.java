package boj.step.three_loop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b5_p08393 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/three_loop/input/p08393.txt")
				);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
