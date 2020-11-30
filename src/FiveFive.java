import java.io.PrintWriter;
import java.util.Scanner;

public class FiveFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int A = in.nextInt();
        int B = A / 10;
        long C = B * (B+1);
        C = C * 100;
        C = C + 25;

        pw.println(C);
        pw.flush();
    }
}
