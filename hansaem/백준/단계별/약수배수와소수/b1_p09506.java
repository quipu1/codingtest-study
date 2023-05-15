package 백준.단계별.약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b1_p09506 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/약수배수와소수/input/p09506.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st; //= new StringTokenizer(br.readLine());


        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            if (num == -1) break;
            List<Integer> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            list.add(1);
            int sum = 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    list.add(i); sum += i;
                    if (num / i != i) {
                        list.add(num / i);
                        sum += num / i;
                    }
                }
                Collections.sort(list);
            }
            if (sum != num) {
                sb.append(num + " is NOT perfect.");
            } else {
                sb.append(num + " = ");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i != list.size() - 1) sb.append(" + ");
                }
            }
            bw.write(sb.toString() + "\n");
            bw.flush();
        }
        bw.close();
    }
}
