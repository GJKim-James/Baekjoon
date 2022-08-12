package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            // 기본적으로 compare 메소드는 3가지 리턴 값(양의 정수, 0, 음의 정수)에 의해 위치를 바꿀지 결정
            // 양수일 경우 Arrays.sort()에서 정렬 알고리즘에 의해 위치를 바꾸고, 0이나 음의 정수인 경우는 두 객체의 위치는 바뀌지 않는다.
            public int compare(String o1, String o2) {
                // 단어 길이가 같은 경우 사전 순으로 출력
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                // 그 외의 경우, 기본적으로 길이가 짧은 순서대로 출력
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append("\n"); // 다음 for 문에서 자기 자신과 이전 것의 비교를 하기 위해 arr[0] 값은 sb 에 저장
        // 만약, 저장하지 않고 0번째부터 반복문을 실행하면 0번째와 -1번째를 비교해야 하기 때문에 인덱스 에러가 난다.

        for (int i = 1; i < N; i++) {
            // 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력(중복된 단어는 한 번만 출력)
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.print(sb);

    }

}
