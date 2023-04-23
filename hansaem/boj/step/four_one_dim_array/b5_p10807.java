package boj.step.four_one_dim_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b5_p10807 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(
				new FileReader("hansaem/boj/step/four_one_dim_array/input/p10807.txt")
				);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;// = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmpST;
		
		//int N = Integer.parseInt(st.nextToken());
		while ( (tmpST = br.readLine()) != null ) {
			st = new StringTokenizer(tmpST);
			int N = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(br.readLine());
			int answer = 0;
			for (int i = 0; i < N; i++) {
				if (V == Integer.parseInt(st.nextToken())) answer += 1;
			}
			sb.append(answer).append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		
	}
}
