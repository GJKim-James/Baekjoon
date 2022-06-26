import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 26

        int cnt = 0; // 몇 번 반복되었는지 횟수(몇 번만에 처음 입력한 수와 같아졌는지 확인할 변수)
        int copyNum = N; // 처음 입력한 수와 같아진 것을 확인할 변수

        do {
            // N의 일의 자릿수는 새로운 수의 십의 자릿수 : (N % 10) * 10
            // N의 각 자릿수의 합의 일의 자릿수가 T의 일의 자릿수 : ((N / 10) + (N % 10)) % 10
            // N 값을 계속 새로운 값으로 대체해야하므로 같은 변수 N 값에 넣어준다.
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copyNum != N); // 처음 입력한 수와 같은 copyNum 값과 N 값이 같지 않으면 계속 반복

        System.out.println(cnt); // 반복된 횟수 출력

    }

}
