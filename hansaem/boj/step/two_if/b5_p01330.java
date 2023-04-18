package boj.step.two_if;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b5_p01330 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/two_if/input/p01330.txt") 
		);
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = a - b;
		if (c > 0) System.out.println(">");
		else if (c == 0) System.out.println("==");
		else if (c < 0) System.out.println("<");
	}
}
