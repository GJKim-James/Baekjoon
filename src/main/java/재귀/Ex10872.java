package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int factorial_result = factorial(N);

        System.out.print(factorial_result);

    }

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        }

        return N * factorial(N - 1);
    }

}
