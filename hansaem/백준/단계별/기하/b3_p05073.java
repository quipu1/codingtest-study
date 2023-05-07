package 백준.단계별.기하;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b3_p05073 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p05073.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int line1 = Integer.parseInt(st.nextToken());
            int line2 = Integer.parseInt(st.nextToken());
            int line3 = Integer.parseInt(st.nextToken());
            if (line1 == 0) break;

            int[] arrays = {line1, line2, line3};
            Arrays.sort(arrays);

            if (arrays[2] >= arrays[0] + arrays[1]) sb.append("Invalid");
            else if (arrays[0] == arrays[1] && arrays[1] == arrays[2]) sb.append("Equilateral");
            else if (arrays[0] != arrays[1] && arrays[0] != arrays[2] && arrays[1] != arrays[2]) sb.append("Scalene");
            else sb.append("Isosceles");
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
