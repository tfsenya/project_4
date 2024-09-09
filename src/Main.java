//Iterate through String. Print each character of the String in every new line.
public class Main {
    public static void main(String[] args) {
//Demonstrate while loop
        int i = 1;
        int l =1;
        while (i < 5) {
            System.out.println("Hi!!!");

            i++;
        }

//Demonstrate do while loop.

        do{
            System.out.println(l);
            l++;
        }while(l<=10);

        System.out.println(" ");

//Demonstrate for loop.
//Print through loop, using increment (i++): 1 2 3 4 5 6 7 8 9 10
        for(int m=1;m<=10;m++){
            System.out.println(m);
        }

        System.out.println(" ");

//Print through loop, using decrement (i--): 10 9 8 7 5 4 3 2 1

        int a=10;
        while(a>=1){
            System.out.println(a);
            a--;
        }

        System.out.println(" ");
//Demonstrate loop inside the loop (nested loop). For example, create for loop inside the outer
// for loop, make some output inside these loops. Understand the essence of such algorithm.
        int weeks = 3;
        int days = 7;
        int z = 1;
        while (z <= weeks) {
            System.out.println("Week number: " + z);
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day number: " + j);
            }
            ++z;
        }
    }
}