package boj.step.two_if;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b4_p02480 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/two_if/input/p02480.txt")1
				);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a == b && a == c && b == c) System.out.println(10000 + a*1000);
		else if (a != b && a != c && b != c) {
			System.out.println(Math.max(Math.max(a, b), c)*100);
		} else {
			if (a == b) System.out.println(1000 + a*100);
			if (a == c) System.out.println(1000 + a*100);
			if (c == b) System.out.println(1000 + b*100);
		}
	}
}
