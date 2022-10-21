import java.io.*;

public class Ex2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        int A = Integer.parseInt(br.readLine()); // 150
        int B = Integer.parseInt(br.readLine()); // 266
        int C = Integer.parseInt(br.readLine()); // 427

        int result = A * B * C; // 17037300

        String res = String.valueOf(result);

        for (int i = 0; i < res.length(); i++) {
            arr[(res.charAt(i) - 48)]++;
        }

        // 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력
        // 둘째 줄부터는 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력
        for (int value : arr) {
            bw.write(String.valueOf(value) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

}
