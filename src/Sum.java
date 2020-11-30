import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int sum = 0;

        short n = in.nextShort();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = 1; i >= n ; i--) {
                sum = sum + i;
            }
        }
        pw.println(sum);
        pw.flush();
    }
}
