package 배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] arr = new double[Integer.parseInt(br.readLine())]; // 3

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 40 80 60

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;

        Arrays.sort(arr); // 40.0 60.0 80.0

        for (int i = 0; i < arr.length; i++) {
            // arr[arr.length - 1]은 입력된 숫자 중 최댓값을 의미
            sum += (arr[i] / arr[arr.length - 1] * 100);
        }

        bw.write(String.valueOf(sum / arr.length));

        br.close();
        bw.flush();
        bw.close();

    }

}
