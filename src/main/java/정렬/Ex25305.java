package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex25305 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 응시자 수 ex) 5
        int k = Integer.parseInt(st.nextToken()); // 상 받는 사람 수 ex) 2

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken()); // 100 76 85 93 98
        }

        Arrays.sort(arr); // 76 85 93 98 100

        System.out.println(arr[N - k]); // 커트라인 점수 출력

    }

}
