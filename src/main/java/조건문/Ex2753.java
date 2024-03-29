package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        // 윤년이면 1, 아니면 0 출력
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("1");
            } else if (year % 100 != 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }

    }

}
