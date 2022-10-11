package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // 'i < s.length() - 1'은 StringIndexOutOfBoundsException 에러를 방지하기 위해 설정
            // 길이가 10인 문자열의 맨 마지막 문자를 조건 검사할 때 11번째 인덱스를 참조해야하는데 11번째 인덱스가 존재하지 않는다.
            // 따라서, 문자열의 전체 길이보다 작을 경우에만 조건 검사를 실행하도록 설정
            if (ch == 'c' && i < s.length() - 1) { // ch 가 c 이고
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') { // ch 다음 문자가 '=' or '-' 이면
                    // (i + 1)까지 한 문자로 취급해야하기 때문에 i 를 1 증가시킨다.
                    i++;
                }
            } else if (ch == 'd' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '-') { // 문자가 d- 이면
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < s.length() - 2) {
                    if (s.charAt(i + 2) == '=') { // 문자가 dz= 이면
                        i += 2; // 'dz='가 3글자이기 때문에 i 를 2 증가
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'j') { // 문자가 'lj' or 'nj' 이면
                    i++;
                }
            } else if ((ch == 's' || ch == 'z') && i < s.length() - 1) {
                if (s.charAt(i + 1) == '=') { // 문자가 's=' or 'z=' 이면
                    i++;
                }
            }

            cnt++;

        }

        System.out.print(cnt);

    }

}
