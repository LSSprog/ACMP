import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        BigInteger maxGold;

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        maxGold = a;
        if (b.compareTo(maxGold) > 0) {
            maxGold = b;
        }
        if (c.compareTo(maxGold) > 0) {
            maxGold = c;
        }
        pw.println(maxGold);
        pw.close();
    }
}
