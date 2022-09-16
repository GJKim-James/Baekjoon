package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 10
        int X = Integer.parseInt(st.nextToken()); // 5

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        // N개의 숫자 중에서 X보다 작은 수 찾기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken()); // 1 10 4 9 2 3 8 5 7 6

            if (num < X) {
                sb.append(num + " ");
            }
        }

        bw.write(String.valueOf(sb)); // 1 4 2 3

        br.close();
        bw.flush();
        bw.close();

    }

}
