import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" "); // 한 줄 입력 받고 공백을 기준으로 배열에 각각 저장

            int R = Integer.parseInt(str[0]); // 반복 횟수 R

            String S = str[1]; // 문자열 S

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }

            System.out.println();
        }

        br.close();

    }

}
