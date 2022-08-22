package 입출력과사칙연산;

import java.io.*;

public class Ex10926 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine() + "??!"); // ex) joonas 입력하면 joonas??! 출력

        bw.flush();
        bw.close();

    }

}
