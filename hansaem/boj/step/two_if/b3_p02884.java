package boj.step.two_if;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b3_p02884 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/two_if/input/p02884.txt")
		);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int alarm = 45;
		
		if (m - alarm > 0) {
			System.out.println(h + " " + (m - alarm));
		} else if (m - alarm < 0) {
			int carry = (m - alarm) / 60 - 1;
			h = (24 + h + carry) % 24;
			System.out.println(h + " " + (60 + (m - alarm) % 60));
		} else {
			System.out.println(h + " " + (m - alarm));
		}
		
		while ((st = new StringTokenizer(br.readLine())) != null ) {
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			if (m - alarm > 0) {
				System.out.println(h + " " + (m - alarm));
			} else if (m - alarm < 0) {
				int carry = (m - alarm) / 60 - 1;
				h = (24 + h + carry) % 24;
				System.out.println(h + " " + (60 + (m - alarm) % 60));
			} else {
				System.out.println(h + " " + (m - alarm));
			}
		}
	}
}
