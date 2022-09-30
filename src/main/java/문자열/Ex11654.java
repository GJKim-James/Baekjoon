package 문자열;

import java.io.*;

public class Ex11654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ASCII = br.read();

        // 알파벳 소문자, 대문자, 숫자 0-9 중 입력으로 주어진 글자의 아스키 코드값을 출력
        System.out.println(ASCII);

    }

}
