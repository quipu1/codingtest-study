package 백준.단계별.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class s4_p01018 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/브루트포스/input/p01018.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String str;
        String[][] map = new String[N][M];
        int row = 0;
        while ((str = br.readLine()) != null) {
            String[] tmp = str.split("");
            for (int j = 0; j < tmp.length; j++) {
                map[row][j] = tmp[j];
            }
            row += 1;
        }
        String[] rowW = {"W", "B", "W", "B", "W", "B", "W", "B"};
        String[] rowB = {"B", "W", "B", "W", "B", "W", "B", "W"};
        String type = "W";

        int min = 65;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                for (int u = 0; u < 8; u++) {
                    for (int k = 0; k < 8; k++) {
                        if (type.equals("W")) {
                            if (!map[i + u][j + k].equals(rowW[k])) count += 1;
                        } else {
                            if (!map[i + u][j + k].equals(rowB[k])) count += 1;
                        }
                    }
                    if (type.equals("W")) type = "B";
                    else type = "W";
                }
                if (count < min) min = count;
            }
        }
        type = "B";
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                for (int u = 0; u < 8; u++) {
                    for (int k = 0; k < 8; k++) {
                        if (type.equals("W")) {
                            if (!map[i + u][j + k].equals(rowW[k])) count += 1;
                        } else {
                            if (!map[i + u][j + k].equals(rowB[k])) count += 1;
                        }
                    }
                    if (type.equals("W")) type = "B";
                    else type = "W";
                }
                if (count < min) min = count;
            }
        }
        sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
