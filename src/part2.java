import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input string ");
            String str = scanner.nextLine();
            String str1 = str.toUpperCase();
            System.out.println(str1);
            System.out.print("Would you like to continue? Type yes or no ");
            String input = scanner.nextLine();
            if (!input.equals("yes")) {
                break;
            }
        }
    }
}