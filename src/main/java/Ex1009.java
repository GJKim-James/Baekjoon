import java.io.*;
import java.util.StringTokenizer;

public class Ex1009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 5

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 1 3 6 7 9
            int b = Integer.parseInt(st.nextToken()); // 6 7 2 100 635

            int result = 1;
            for (int j = 0; j < b; j++) {
                result *= a;
                if (result > 10) {
                    result %= 10;
                }
                if (result == 0) {
                    result = 10;
                    break;
                }
            }

            bw.write(String.valueOf(result) + "\n"); // 1 7 6 1 9
        }

        bw.flush();
        bw.close();

    }

}
