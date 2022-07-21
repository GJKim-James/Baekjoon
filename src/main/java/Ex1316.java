import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int cnt = 0; // 그룹 단어의 갯수를 의미하는 변수

        int N = Integer.parseInt(br.readLine()); // 단어의 갯수

        for (int i = 0; i < N; i++) {
            if (check() == true) { // 그룹 단어인지 아닌지 검사하는 함수 check()
                cnt++; // 그룹 단어라면 cnt 1 증가
            }
        }

        System.out.print(cnt);

    }

    public static boolean check() throws IOException {

        boolean[] check = new boolean[26]; // 알파벳 26개 ex) check[0] -> 'a' 가 입력받은 문자열에 쓰였는지 여부 (true or false)

        int prev_char = 0; // 이전 문자

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {

            int now_char = s.charAt(i); // 입력받은 문자열의 i 번째 문자 (현재 문자)

            // 이전 문자와 현재 문자가 다르면
            if (prev_char != now_char) {
                // 현재 문자가 처음 나오는 경우라면 (false 인 경우)
                if (check[now_char - 'a'] == false) {
                    check[now_char - 'a'] = true;
                    prev_char = now_char;
                } else { // 현재 문자가 이미 나온 적이 있는 경우 (그룹 단어가 아님)
                    return false; // 함수 종료
                }
            } else { // 이전 문자와 현재 문자가 같으면 (같은 문자가 연속되었다면)
               continue;
            }

        }

        return true;

    }

}
