package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2581 {

    public static boolean prime[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N + 1];

        find_prime();

        // 소수의 합과 최솟값 구하기
        int sum = 0; // 소수들의 합
        int min = Integer.MAX_VALUE; // 소수 값들 중 최솟값

        for (int i = M; i <= N; i++) {
            if (prime[i] == false) { // 소수이면
                sum += i; // sum 변수에 더하기
                if (min == Integer.MAX_VALUE) { // 첫 번째 소수가 최솟값
                    min = i;
                }
            }
        }

        if (sum == 0) { // 소수가 없으면
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    // 에라토스테네스의 체 알고리즘
    public static void find_prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) { // 이미 확인된 배열이면 skip
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) { // 소수 아닌 숫자 걸러내기
                prime[j] = true; // true 이면 소수 아님, false 이면 소수
            }
        }
    }

}