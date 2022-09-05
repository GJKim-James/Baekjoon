package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2739 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 출력하고 싶은 단

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }

    }

}
