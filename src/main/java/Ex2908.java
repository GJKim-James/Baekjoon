import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 734 893

        // StringBuilder 에 뒤집는 함수 reverse가 존재한다.
        int reverse_A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 437
        int reverse_B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 398

        if (reverse_A > reverse_B) {
            System.out.print(reverse_A);
        } else {
            System.out.print(reverse_B);
        }

    }

}
