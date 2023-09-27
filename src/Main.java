import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Random Values IN Java
        Random random = new Random();
        int x = random.nextInt(6)+1;
        double y = random.nextDouble(6)+1;
        System.out.println(y);

    }
}