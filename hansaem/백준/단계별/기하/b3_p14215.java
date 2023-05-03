package 백준.단계별.기하;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b3_p14215 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/기하/input/p14215.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int l1 = Integer.parseInt(st.nextToken());
        int l2 = Integer.parseInt(st.nextToken());
        int l3 = Integer.parseInt(st.nextToken());

        int[] array = {l1, l2, l3};
        Arrays.sort(array);

        if (array[2] > array[0] + array[1]) array[2] -= array[2] - array[0] - array[1];
        while (array[0] + array[1] <= array[2]) {
            array[2] -= 1;
        }
        sb.append(array[0] + array[1] + array[2]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
