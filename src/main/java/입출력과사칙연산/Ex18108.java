package 입출력과사칙연산;

import java.io.*;

public class Ex18108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine()); // 불기 연도 y ex) 2541

        bw.write(String.valueOf(y - 543)); // 불기 연도를 서기 연도로 변환하여 출력 ex) 1998

        bw.flush();
        bw.close();

    }

}
