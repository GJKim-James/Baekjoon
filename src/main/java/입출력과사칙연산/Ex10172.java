package 입출력과사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex10172 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine();

        bw.write("|q p|   /}");
        bw.newLine();

        bw.write("( 0 )\"\"\"\\");
        bw.newLine();

        bw.write("|\"^\"`    |");
        bw.newLine();

        bw.write("||_/=\\\\__|");

        bw.flush();
        bw.close();

    }

}
