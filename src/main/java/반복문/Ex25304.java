package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex25304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine()); // 총 금액
        int N = Integer.parseInt(br.readLine()); // 구매한 물건의 종류의 수

        int total_price = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken()); // 물건의 가격
            int b = Integer.parseInt(st.nextToken()); // 물건의 개수

            int sum = a * b;

            total_price += sum; // 구매한 물건들의 총 금액
        }

        if (total_price == X) {
            System.out.print("Yes"); // 입력한 총 금액과 구매한 물건들의 총 금액이 일치하면 Yes 출력
        } else {
            System.out.print("No"); // 그렇지 않으면 No 출력
        }

    }

}
