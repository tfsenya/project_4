import java.util.Scanner;
public class part4 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your age");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Are you a boy or a girl");
            String gen = scanner.nextLine();
            if (age < 11 && age >= 0) {
                System.out.println("You should learn letters");
            } else if (age < 18 && age >= 11 && gen.equals("boy")) {
                System.out.println("You should read marvel comics");
            } else if (age < 18 && age >= 11 && gen.equals("girl")) {
                System.out.println("You should read barbie comics");
            } else if (age < 30 && age >= 18 && gen.equals("boy")) {
                System.out.println("You should read a business book like Rich dad poor dad");
            } else if (age < 30 && age >= 18 && gen.equals("girl")) {
                System.out.println("You should read a fashion magazine vogue");
            } else if (age >= 30 && age < 45 && gen.equals("boy")) {
                System.out.println("You should read a fiction book like 1984");
            } else if (age >= 30 && age < 45 && gen.equals("girl")) {
                System.out.println("You should read a fiction book like Jane Eyre");
            } else {
                System.out.println("You should read a science book like Great picture");
            }
            System.out.println(" ");
            System.out.print("Would you like to continue? Type yes or no ");
            String yes = scanner.nextLine();
            if (!yes.equals("yes")) {
                break;
            }
        }
    }
}
