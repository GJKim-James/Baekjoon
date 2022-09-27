package 함수;

public class Ex4673 {

    public static void main(String[] args) {

        boolean[] checkNum = new boolean[10001]; // 1부터 10000까지이므로 10001로 설정

        for (int n = 1; n < 10001; n++) {
            int number = d(n); // number 의 생성자는 n 이다. 즉, n(생성자)이 없는 숫자 number(셀프 넘버)를 구하는 문제

            if (number < 10001) { // 10000보다 작거나 같은 셀프 넘버를 구해야하기 때문에 범위 지정
                checkNum[number] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int number = 1; number < 10001; number++) {
            if (!checkNum[number]) { // checkNum[number]가 false 이면, 즉 셀프 넘버를 sb 에 추가
                sb.append(number).append("\n");
            }
        }

        System.out.println(sb); // 셀프 넘버(생성자가 없는 숫자) 출력

    }

    public static int d(int n) {
        int sum = n;

        while (n != 0) {
            sum += n % 10; // sum 변수에 n의 일의 자리 수 더하기

            n = n / 10; // 더한 일의 자리 수를 없애기 위해 10으로 나눔
        }

        return sum; // sum 은 생성자가 있는 숫자
    }

}
