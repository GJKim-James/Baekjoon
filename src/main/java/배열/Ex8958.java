package 배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스

        String[] arr = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < test_case; i++) {

            int cnt = 0; // 'O' 연속 횟수
            int sum = 0; // 누적 점수

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }

                sum += cnt;

            }

            bw.write(sum + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

}
