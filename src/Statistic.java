import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        List<Integer> evenDays = new ArrayList<>();
        List<Integer> oddDays = new ArrayList<>();
        int x;

        int size = in.nextInt();
        //int[] days = new int[size];

        for (int i = 0; i < size; i++) {
            //days[i] = in.nextInt();
            x = in.nextInt();
            if (x % 2 != 0) {
                evenDays.add(x);
            } else {
                oddDays.add(x);
            }
        }

        for (int i = 0; i < evenDays.size(); i++) {
            pw.printf("%d ", evenDays.get(i));
        }
        pw.println();
        for (int i = 0; i < oddDays.size(); i++) {
            pw.printf("%d ", oddDays.get(i));
        }
        pw.println();
        if (evenDays.size() <= oddDays.size() ) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.flush();
    }
}
