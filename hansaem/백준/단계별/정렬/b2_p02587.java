package 백준.단계별.정렬;

import java.io.*;
import java.util.*;

public class b2_p02587 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p02587.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str;
        List<Integer> list = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            list.add(num);
        }
        Collections.sort(list);
        sb.append(list.stream().mapToInt(i -> i).sum() / 5).append("\n").append(list.get(2));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
