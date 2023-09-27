import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Graphical user Interface In Java
        String name = JOptionPane.showInputDialog("Enter Your Name:");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Age")); //converting string to int
        JOptionPane.showMessageDialog(null,"Your Age is : "+age);

        double height = Double.parseDouble( JOptionPane.showInputDialog("Enter Your Height")); //converting string to int
        JOptionPane.showMessageDialog(null,"Your height is : "+height+"cm");
    }
}