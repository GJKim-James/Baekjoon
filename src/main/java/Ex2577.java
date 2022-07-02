import java.io.*;

public class Ex2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        String res = String.valueOf(result);

        for (int i = 0; i < res.length(); i++) {
            arr[(res.charAt(i) - 48)]++;
        }

        for (int value : arr) {
            bw.write(String.valueOf(value) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

}
