package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 숫자의 갯수 N ex) 11

        String a = br.readLine(); // 숫자 N개를 공백 없이 입력 받음(문자열로 받음) ex) 10987654321

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0'; // 입력 받은 숫자 N개의 합 구하기
        }

        System.out.println(sum); // ex) 46

    }

}
