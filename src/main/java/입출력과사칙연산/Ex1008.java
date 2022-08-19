import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1008 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        System.out.println(a / b);

        /* String 변수 str 생성하지 않고 입력과 동시에 구분자로 분리해도 상관없다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());

		System.out.println(a/b);
        */

    }

}
