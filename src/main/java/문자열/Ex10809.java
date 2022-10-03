package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳 갯수만큼 배열 생성

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 배열의 각 위치를 -1로 초기화
        }

        String S = br.readLine(); // 문자열 입력 받음 ex) baekjoon

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (arr[ch - 'a'] == -1) { // arr 원소 값이 -1 인 경우에만 초기화
                // arr 배열의 인덱스(원소 위치)는 ch가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
                // 만약 b 라는 문자가 ch 에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고, arr[1] 은 문자 b를 가리킨다.
                arr[ch - 'a'] = i;
            }
        }

        for (int value : arr) {
            // 배열 출력 ex) 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
            System.out.print(value + " ");
        }

    }

}
