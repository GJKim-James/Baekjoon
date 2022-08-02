package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 달팽이가 올라갈 나무 막대 높이

        int estimated_day = (V - B) / (A - B); // 달팽이가 나무 막대를 올라가는데 걸리는 일수

        if ((V - B) % (A - B) != 0) {
            estimated_day++;
        }

        System.out.print(estimated_day);

    }

}
