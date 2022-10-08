package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); // ex) The Curious Case of Benjamin Button

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.print(st.countTokens()); // ex) 6

    }

}
