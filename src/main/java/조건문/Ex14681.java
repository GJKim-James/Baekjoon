package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14681 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        // 단, X 좌표와 Y 좌표는 모두 양수나 음수라고 가정한다.
        if (X > 0) {
            if (Y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (Y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }

    }

}
