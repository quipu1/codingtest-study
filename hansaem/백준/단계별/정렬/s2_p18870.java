package 백준.단계별.정렬;

import java.io.*;
import java.util.*;

public class s2_p18870 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p18870.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        });
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> array = new ArrayList<>();
        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, 0);
            set.add(tmp);
            array.add(tmp);
        }
        int idx = 0;
        for (int s : set) {
            map.put(s, idx++);
        }
        for (int i : array) {
            sb.append(map.get(i) + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
