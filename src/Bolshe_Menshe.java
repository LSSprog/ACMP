import java.io.*;
import java.util.*;

public class Bolshe_Menshe {
    public static void main(String[] args){
        String znak;

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            znak = ">";
        } else if (a < b) {
            znak = "<";
        } else {
            znak = "=";
        }

        out.println(znak);
        out.flush();
    }
}