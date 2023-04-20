package boj.step.four_one_dim_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b5_p05597 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/four_one_dim_array/input/p05597.txt")
				);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;// = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] array = new int[31];
		String str;
		while ( (str = br.readLine()) != null ) {
			st = new StringTokenizer(str);
			int number = Integer.parseInt(st.nextToken());
			array[number] = 1;
		}
		for (int i = 1; i < 31; i++) {
			if (array[i] == 0) System.out.println(i);
		}
		
	}
}
