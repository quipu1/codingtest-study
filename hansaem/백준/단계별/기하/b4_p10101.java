package 백준.단계별.기하;

import java.io.*;
import java.util.StringTokenizer;

public class b4_p10101 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p10101.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());

        if (angle1 + angle2 + angle3 != 180) sb.append("Error");
        else if (angle1 == angle2 && angle2 == angle3) sb.append("Equilateral");
        else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) sb.append("Scalene");
        else sb.append("Isosceles");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
