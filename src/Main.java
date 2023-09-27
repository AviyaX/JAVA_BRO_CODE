import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /* Logical Operators
                   && -  (AND) - Both Conditions Must Be true
                   || -  (OR)- At least one condition must be true
                   ! -  (NOT) - Reverse Boolean Value of a condition
         */
//        int temp =15;
//        if (temp>30){
//            System.out.println("It is hot outside");
//        }
//        else if(temp>=20 && temp<=30){
//            System.out.println("It is Warm Outside");
//        }
//        else{
//            System.out.println("It is cold");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your Are playing a game! Press q or Q for exit.");
//        String res = scanner.next();
//        if(res.equals("q") || res.equals("Q")){ // checking Strings ==
//            System.out.println("You Exit the game");
//        }else{
//            System.out.println("You are still playing the game");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Are playing a game! Press q or Q for exit.");
        String res = scanner.next();
        if(!res.equals("q") && !res.equals("Q")){ // checking Strings ==
            System.out.println("You are still playing the game");
        }else{
            System.out.println("You Exit the game");
        }
    }
}