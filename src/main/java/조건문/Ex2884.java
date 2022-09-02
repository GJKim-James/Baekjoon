package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int H = Integer.parseInt(st.nextToken()); // 시
        int M = Integer.parseInt(st.nextToken()); // 분

        // 입력 시간보다 45분 일찍 알람 설정하기
        if (M < 45) {
            H--;
            M = 60 - (45 - M);

            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }

    }

}
