import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 5

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 1 1 1 6 0
        }

        int[] B = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st2.nextToken()); // 2 7 8 3 1
        }

        Arrays.sort(A); // 0 1 1 1 6
        Arrays.sort(B); // 1 2 3 7 8

        int sum = 0;
        for (int j = 0; j < N; j++) {
            sum += A[j] * B[N - j - 1];
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();

    }

}
