import java.io.*;

public class Ex2741 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 5

        for (int i = 0; i < N; i++) {
            bw.write((i + 1) + "\n");
            // 1
            // 2
            // 3
            // 4
            // 5
        }

        bw.flush();
        bw.close();

    }

}
