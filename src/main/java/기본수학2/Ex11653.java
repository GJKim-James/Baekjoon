package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 72

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(N); i++) { // 'i <= N'으로 조건식을 사용해도 되지만 좀 더 효율적으로 하기 위해 제곱근 사용.
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        if (N != 1) {
            sb.append(N); // 예를 들어 N이 34일 때 for 문 i 값이 5일 때 종료되는데, 그렇게 되면 N이 17을 인수로 가지는데도 불구하고
            // 출력하지 못하고 종료된다. 그래서 N이 1이 아니라면 소수이자 인수이기 때문에 sb에 추가해준다.
        }

        System.out.print(sb); // 2
                              // 2
                              // 2
                              // 3
                              // 3

    }

}
