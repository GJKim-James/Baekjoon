package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex10757 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken()); // 9223372036854775807
        BigInteger B = new BigInteger(st.nextToken()); // 9223372036854775808

        BigInteger sum = A.add(B); // A + B; 18446744073709551615

        System.out.print(sum);

    }

}
