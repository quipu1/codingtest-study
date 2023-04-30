package 백준.단계별.심화1;

import java.io.*;

public class s5_p25206 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/심화1/input/p25206.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = 20;
        double sumScore = 0.0;
        double sumGrade = 0.0;
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if (str[2].equals("P")) {
                continue;
            }
            double score = 0.0;
            switch (str[2]) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F" : score = 0.0; break;
            }
            sumScore += Double.parseDouble(str[1]) * score;
            sumGrade += Double.parseDouble(str[1]);
        }
        System.out.println(Math.round(sumScore / sumGrade * 1000000) / 1000000.0);

        bw.close();
    }
}
