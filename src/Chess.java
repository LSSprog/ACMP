import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //PrintWriter pw = new PrintWriter(System.out);

        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] num = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};

        String Ch1, Ch2, Ch4, Ch5;
        int ch1pos = 0;
        int ch2pos = 0;
        int ch4pos = 0;
        int ch5pos = 0;
        char[] cmd = new  char[5];

        String command = scanner.nextLine();

        if (command.length() == 5) {
            cmd = command.toCharArray();

            Ch1 = String.valueOf(cmd[0]);
            Ch2 = String.valueOf(cmd[1]);
            Ch4 = String.valueOf(cmd[3]);
            Ch5 = String.valueOf(cmd[4]);

            if (isInGame(Ch1, letters) && isInGame(Ch2, num) && isInGame(Ch4, letters) &&
                        isInGame(Ch5, num) && String.valueOf(cmd[2]).equals("-")) {
                //System.out.println("всё ок");
                ch1pos = count(Ch1, letters);
                ch2pos = count(Ch2, num);
                ch4pos = count(Ch4, letters);
                ch5pos = count(Ch5, num);
                //System.out.println(ch1pos + " " + ch2pos + " " + ch4pos + " " + ch5pos);
                int razL = Math.abs(ch1pos - ch4pos);
                int razN = Math.abs(ch2pos - ch5pos);

                //System.out.println(razL + " " + razN);
                if (((razL == 1) && (razN == 2)) || ((razL == 2) && razN == 1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                error();
            }
        } else {
            error();
        }
    }

    public static boolean isInGame(String ch, String[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (ch.equals(letters[i])) {
                return true;
            }
        }
        return false;
    }
    public static void error() {
        System.out.println("ERROR");
    }

    public static int count(String chr, String[] letters) {
        int pos = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(chr)) {
                pos = i+1;
            }
        }
        return pos;
    }
}
