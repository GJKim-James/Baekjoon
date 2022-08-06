package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 문제에서 수의 범위가 10,000 보다 작거나 같은 자연수로 주어졌다.
        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            // 해당 수의 인덱스 값을 1씩 증가
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 주어진 범위가 자연수이므로 1부터 시작
        for (int i = 1; i < 10001; i++){
            // i 값의 인덱스 값이 0이 될 때까지 출력
            while (arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }

        System.out.println(sb);

    }

}
