import java.io.*;

public class Ex2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()); // 472
        int B = Integer.parseInt(br.readLine()); // 385

        bw.write(String.valueOf(A * (B % 10)) + "\n"); // 472 * 5
        bw.write(String.valueOf(A * (B % 100 / 10)) + "\n"); // 472 * 80
        bw.write(String.valueOf(A * (B / 100)) + "\n"); // 472 * 300
        bw.write(String.valueOf(A * B)); // 472 * 385

        bw.flush();
        bw.close();

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int A = sc.nextInt(); // 472
//        int B = sc.nextInt(); // 385
//
//        sc.close();
//
//        System.out.println(A * (B % 10)); // 472 * 5
//        System.out.println(A * (B % 100 /10)); // 472 * 80
//        System.out.println(A * (B / 100)); // 472 * 300
//        System.out.println(A * B); // 472 * 385
//    }

}
