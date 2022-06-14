import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 시
        int B = Integer.parseInt(st.nextToken()); // 분

        int C = Integer.parseInt(br.readLine()); // 요리하는 데 필요한 시간(분)

        // 1시간은 60분. C분을 60으로 나눈 몫이 시간이 되고, 나머지가 분이 된다.
        A += C / 60;
        B += C % 60;

        // B가 60분 이상이면 A에 1시간 더하고, B는 60분 빼주기
        if (B > 59) {
            A += 1;
            B -= 60;
        }

        // A가 24시 이상이면 0시로 바꿔주기
        if (A > 23) {
            A -= 24;
        }

        System.out.println(A + " " + B);

    }

}
