import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //If Statements - Perform a block of code if it;s condition evaliate to be true

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt();
        if(age>=75){
            System.out.println("You Are OLD");

        }
        else if(age>=18) {
            System.out.println("You are an Adult");

        }
        else{
            System.out.println("Your Are NoT Adult ");
        }

    }
}