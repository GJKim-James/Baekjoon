package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10952 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 각 테스트 케이스마다 A + B 출력
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 입력의 마지막에는 0 두 개를 써서 끝냄
            if (A == 0 && B == 0) {
                break;
            }

            bw.write((A + B) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

}
