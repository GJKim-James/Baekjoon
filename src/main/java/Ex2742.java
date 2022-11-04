import java.io.*;

public class Ex2742 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 5

        for (int i = N; i > 0; i--) {

            bw.write(i + "\n");
            // 5
            // 4
            // 3
            // 2
            // 1

        }

        bw.flush();
        bw.close();

    }

}
