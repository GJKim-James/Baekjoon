package 입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // ex) 5
        int B = Integer.parseInt(st.nextToken()); // ex) 8
        int C = Integer.parseInt(st.nextToken()); // ex) 4

        // (A + B) % C 가 ((A % C) + (B % C)) % C 와 같은지
        bw.write(String.valueOf((A + B) % C) + "\n"); // ex) 1
        bw.write(String.valueOf(((A % C) + (B % C)) % C) + "\n"); // ex) 1

        // (A × B) % C 가 ((A % C) × (B % C)) % C 와 같은지 확인하는 문제
        bw.write(String.valueOf((A * B) % C) + "\n"); // ex) 0
        bw.write(String.valueOf(((A % C) * (B % C)) % C)); // ex) 0

        bw.flush();
        bw.close();

    }

}
