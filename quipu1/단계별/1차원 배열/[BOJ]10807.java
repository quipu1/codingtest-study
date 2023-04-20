package basic;

import java.io.*;
import java.util.*;
public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        //StringTokenizer 대신 split으로 배열 만들기
        //String[] items = br.readLine().split(" ");
        //List<String> list = new ArrayList<>(Arrays.asList(items));

        int v = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(Collections.frequency(list, v)));

        bw.flush();
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}