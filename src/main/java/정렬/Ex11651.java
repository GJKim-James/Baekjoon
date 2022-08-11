package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 5

        int[][] arr = new int[N][2];
        // 0 4
        // 1 2
        // 1 -1
        // 2 2
        // 3 3

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (y1, y2) -> {
            if (y1[1] == y2[1]) { // 두 번째 원소(y 좌표)가 같다면 첫 번째 원소(x 좌표)끼리 비교
                return y1[0] - y2[0];
            } else {
                return y1[1] - y2[1];
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }

        System.out.print(sb); // 정렬된 x 좌표 y 좌표 출력

    }

}
