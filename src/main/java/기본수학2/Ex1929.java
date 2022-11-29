package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1929 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken()); // 3
        int N = Integer.parseInt(st.nextToken()); // 16

        prime = new boolean[N + 1];

        find_prime(); // 소수 찾기

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb); // 3
                              // 5
                              // 7
                              // 11
                              // 13

    }

    // 에라토스테네스의 체 알고리즘
    public static void find_prime() {

        // true 이면 소수 아니고, false 이면 소수
       prime[0] = true;
       prime[1] = true;

       for (int i = 2; i <= Math.sqrt(prime.length); i++) {
           if (prime[i]) {
               continue;
           }
           for (int j = i * i; j < prime.length; j += i) {
               prime[j] = true;
           }
       }

    }

}
