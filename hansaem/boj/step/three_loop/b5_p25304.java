package boj.step.three_loop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b5_p25304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/three_loop/input/p25304.txt")
				);
		
		StringTokenizer st = null;
		while ( (st = new StringTokenizer(br.readLine())) != null ) {
			long total = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sum += a * b;
			}
			if (sum == total) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
