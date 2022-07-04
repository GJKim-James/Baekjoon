import java.io.*;
import java.util.HashSet;

public class Ex3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[42]; // 나머지가 나올 수 있는 수는 0~41이므로 길이가 42인 boolean 배열 생성

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true; // boolean 배열의 default 값은 false
        }

        int cnt = 0;

        for (boolean value : arr) {
            if (value) { // value 가 true 이면
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.flush();
        bw.close();



//        // HashSet 을 이용한 풀이 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        HashSet<Integer> set = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; i++) {
//            set.add(Integer.parseInt(br.readLine()) % 42);
//        }
//
//        System.out.print(set.size());

    }

}
