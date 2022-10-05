package 문자열;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int R = Integer.parseInt(st.nextToken()); // 반복 횟수 R

            String S = st.nextToken(); // 문자열 S

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                }
            }

            sb.append("\n");

        }

        bw.write(String.valueOf(sb));

        br.close();
        bw.flush();
        bw.close();

    }

}
