import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       // Array - Array is used to store multiple values in a single variable
        String [] cars ={"BMW", "Toyota", "Mustang", "tesla"};
        cars[0] = "Camaro";
        System.out.println(cars[0]);

        String[] cars =new String[3];
        cars[0] = "Camaro";
        cars[1] = "BMW";
        cars[2] = "Tesla";
        System.out.println(cars[0]);

        for(int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
        }



    }
}