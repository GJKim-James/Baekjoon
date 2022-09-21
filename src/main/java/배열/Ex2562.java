package 배열;

import java.io.*;

public class Ex2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 3 29 38 12 57 74 40 85 61
        }

        int max = 0; // 최댓값을 저장할 변수
        int index = 0; // 몇 번째 수가 최댓값인지 확인하기 위한 변수

        int count = 0;

        for (int value : arr) {
            count++;

            if (value > max) {
                max = value;
                index = count;
            }
        }

        // 9개의 서로 다른 자연수 중 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력
        bw.write(String.valueOf(max) + "\n"); // 85
        bw.write(String.valueOf(index)); // 8

        br.close();
        bw.flush();
        bw.close();

    }

}
