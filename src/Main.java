import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Hypotenuse Of a triangle

        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side A : ");
        a = scanner.nextDouble();
        System.out.println("Enter Side B : ");
        b = scanner.nextDouble();

        double hyp = Math.sqrt((a*a) + (b*b));
        System.out.println("Side C (hypotenus) :  " +hyp);

        scanner.close();












    }
}