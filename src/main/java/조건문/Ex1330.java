package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1330 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A가 B보다 큰 경우에는 '>'를 출력
        // A가 B보다 작은 경우에는 '<'를 출력
        // A와 B가 같은 경우에는 '=='를 출력
        System.out.print((A > B) ? ">" : ((A < B) ? "<" : "=="));

    }

}
