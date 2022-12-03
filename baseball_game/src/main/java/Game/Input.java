package Game;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);
    private static int inputNumber;

    public static int getInputNumber() {
        return inputNumber;
    }

    public static void getInput() {
        String result = "";
        int inputN = validInput(scanner.next());
        inputNumber = inputN;
    }

    public static int validInput(String in) {
        try {
            int num = Integer.parseInt(in);
            return num;
        }
        catch (IllegalArgumentException e) {
            System.out.println("숫자만 입력이 가능합니다.");
            System.exit(0);
        }
        return 0;
    }
}
