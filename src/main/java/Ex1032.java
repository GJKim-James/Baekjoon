import java.io.*;

public class Ex1032 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 3

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine(); // config.sys, config.inf, configures
        }

        boolean dif = false;

        for (int i = 0; i < arr[0].length(); i++) {
            dif = false;

            for (int j = 0; j < N - 1; j++) {
                if (arr[j].charAt(i) != arr[j + 1].charAt(i)) {
                    dif = true;
                    break;
                }
            }

            if (dif) {
                System.out.print("?");
            } else {
                System.out.print(arr[0].charAt(i));
            }
        }

    }

}
