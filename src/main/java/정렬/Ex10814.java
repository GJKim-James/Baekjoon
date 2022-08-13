package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 3

        String[][] arr = new String[N][2]; // '나이 이름' 으로 이루어진 배열 생성

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            // 기본적으로 compare 메소드는 3가지 리턴 값(양의 정수, 0, 음의 정수)에 의해 위치를 바꿀지 결정
            // 양수일 경우 Arrays.sort()에서 정렬 알고리즘에 의해 위치를 바꾸고, 0이나 음의 정수인 경우는 두 객체의 위치는 바뀌지 않는다.
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); // 나이가 적은 순으로 정렬
            }
            // 나이가 같으면 입력한 순서대로 그대로 출력하므로 따로 조건을 구현하지 않아도 된다.
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n"); // 정렬된 나이 이름 순으로 sb에 저장
        }

        System.out.print(sb);

    }

}
