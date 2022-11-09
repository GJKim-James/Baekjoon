package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 주어진 숫자 갯수 ex) 4

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ex) 1 3 5 7

        int cnt = 0; // 소수 갯수

        while (st.hasMoreTokens()) {

            boolean isPrime = true; // 소수이면 true, 소수가 아니면 false

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) { // num 이 1 이면 다음 반복문으로
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { // num 이 i 로 나누어 떨어지면
                    isPrime = false; // 소수가 아님으로 false 로 변경
                    break;
                }
            }

            if (isPrime) { // 소수이면
                cnt++; // cnt 1 증가
            }

        }

        System.out.print(cnt); // ex) 3

    }

}
