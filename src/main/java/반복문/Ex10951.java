package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("입력이 끝나면 Ctrl + D 를 눌러주세요.");

        String str;

        while ((str=br.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(str, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write((A + B) + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

}
