package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); // 입력 받는 문자열 ex) Mississipi

        // 입력 받은 문자열에서 a ~ z 알파벳이 몇 번 쓰였는지 확인할 배열 생성(알파벳은 총 26개)
        int[] arr = new int[26]; // arr[0] -> a or A, arr[1] -> b or B, arr[2] -> c or C 등등

        for (int i = 0; i < s.length(); i++) { // 입력 받은 문자열의 길이만큼 반복

            // 'a'는 97, 'A'는 65, 'z'는 122, 'Z'는 90
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { // 문자열의 알파벳이 대문자(A ~ Z)일 경우
                arr[s.charAt(i) - 65]++; // 배열의 인덱스 값 증가('A' 이면 65 - 65 = 0 을 해서 arr[0]의 값이 증가)
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) { // 문자열의 알파벳이 소문자(a ~ z)일 경우
                arr[s.charAt(i) - 97]++; // 배열의 인덱스 값 증가('a' 이면 97 - 97 = 0 을 해서 arr[0]의 값이 증가)
            }

//            // 이렇게 써도 된다.
//            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//                arr[s.charAt(i) - 'A']++;
//            } else {
//                arr[s.charAt(i) - 'a']++;
//            }

        }

        int max = 0;
        char ch = ' '; // 출력할 문자

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) { // 해당 배열의 원소 값이 max 값보다 크면
                max = arr[i]; // max 값을 해당 배열의 원소 값으로 바꿔주고
                ch = (char) (i + 65); // 대문자로 출력해야하기 때문에 65를 더해준다. ex) 0 + 65 = 65 이므로 'A'가 출력된다.
            } else if (arr[i] == max) { // 해당 배열의 원소 값과 max 값이 같으면
                ch = '?'; // ? 출력
            }
        }

        System.out.print(ch);

    }

}
