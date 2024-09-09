import java.util.Scanner;
public class part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Input string to reverse it ");
            String str = sc1.nextLine();
            String reverse = "";
            for(int k = str.length()-1; k>=0; k--){
                reverse = reverse + str.charAt(k);
            }
            System.out.println(reverse);
            System.out.print("Would you like to continue? Type yes or no ");
            String yes = sc.nextLine();
            if(!yes.equals("yes")){
                break;
            }
        }
    }
}
