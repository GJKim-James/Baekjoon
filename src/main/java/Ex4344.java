import java.io.*;
import java.util.StringTokenizer;

public class Ex4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < test_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적

            int N = Integer.parseInt(st.nextToken()); // 학생 수

            int[] arr = new int[N];

            double sum = 0;

            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken()); // 학생 수 만큼의 성적 저장
                arr[j] = score; // 배열 하나 하나에 성적 저장
                sum += score; // 성적 누적 합
            }

            double mean = sum / N; // 평균

            double cnt = 0; // 평균 점수를 넘는 학생 수

            // 평균 점수를 넘는 학생 수 세기
            for (int j = 0; j < N; j++) {
                if (arr[j] > mean) {
                    cnt++;
                }
            }

            // 평균 점수를 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
            bw.write(String.format("%.3f%%", (cnt / N) * 100) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
