import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine()))); // 자연수 N을 입력받고 함수 대입 결과 출력

    }

    // 한수(어떤 양의 정수 N의 각 자리가 등차수열을 이루는 숫자) 구하는 함수
    public static int arithmetic_sequence(int N) {

        int cnt = 0; // 한수 갯수를 표시할 변수

        if (N < 100) { // N이 100보다 작으면 그 숫자들 모두가 한수이기 때문에

            return N; // N이 한수 갯수가 되므로 N을 return

        } else {

            cnt = 99; // N이 100 이상이면 한수는 99개부터 시작하므로 cnt 를 99로 초기화

            for (int i = 100; i <= N; i++) { // 100 이상이면서 N보다 작거나 같은 숫자 중에서 한수 갯수 구하기
                int hun_digit = i / 100; // 백의 자릿수
                int ten_digit = (i / 10) % 10; // 십의 자릿수
                int one_digit = i % 10; // 일의 자릿수

                if ((hun_digit - ten_digit) == (ten_digit - one_digit)) { // N의 각 자릿수가 등차수열을 이루면
                    cnt++; // 한수 갯수 증가
                }
            }

        }

        return cnt;

    }

}
