import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 5

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 20 10 35 30 7

        int[] arr = new int[N];

        int index = 0;

        while (st.hasMoreTokens()) { // hasMoreTokens() 는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false 반환
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr); // 7 10 20 30 35

        bw.write(arr[0] + " " + arr[N - 1]); // 7 35

        br.close();
        bw.flush();
        bw.close();

    }

}
