package boj.step.two_if;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b3_p02525 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/two_if/input/p02525.txt")
				);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());;
		
		st = new StringTokenizer(br.readLine());
		
		int c = Integer.parseInt(st.nextToken());
		
		int carry = (b + c) / 60;
		b = (b + c) % 60;
		a = (a + carry) % 24;
		
		System.out.println(a + " " + b);
		
	}
}
