package 백준.알고리즘기초1.자료구조1_시작;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class s2_p01406 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/알고리즘기초1/자료구조1_시작/input/p01406.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> linkedList = new LinkedList<>();
        for (char ch : br.readLine().toCharArray()) {
            linkedList.add(ch);
        }
        int n = Integer.parseInt(br.readLine());
        ListIterator<Character> iter = linkedList.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int i = 0; i < n; i++) {
            String[] array = br.readLine().split(" ");

            switch (array[0]) {
                case "L":
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case "D":
                    if (iter.hasNext()) iter.next();
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case "P":
                    iter.add(array[1].charAt(0));
                    break;
            }
        }
        for (Character ch : linkedList) sb.append(ch);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
