package 백준.단계별.정렬;

import java.io.*;
import java.util.*;

public class s5_p10814 {
    public static class Member implements Comparable<Member> {
        static int index;
        private int age;
        private String name;
        private int idx;

        {
            index += 1;
        }

        public Member (String age, String name) {
            this.age = Integer.parseInt(age);
            this.name = name;
            this.idx = index;
        }
        @Override
        public String toString() {
            return age + " " + name;
        }

        @Override
        public int compareTo(Member o) {
            if (age == o.age) return idx - o.idx;
            return age - o.age;
        }
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(
                new FileReader("hansaem/백준/단계별/정렬/input/p10814.txt")
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            members[i] = new Member(tmp[0], tmp[1]);
        }
        Arrays.sort(members);
        for (int i = 0; i < N; i++) {
            //System.out.println(members[i].toString());
            sb.append(members[i].toString()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
