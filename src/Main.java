import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
      //String = a refferance data type that can store one or more chatachters
        // refference data type have access to useful methods

        String name="Avishka";

        boolean result = name.equals("hAviska");
        boolean result1 = name.equalsIgnoreCase("aviShka");
        int result2 = name.length();
        char result3 = name.charAt(0);
        int result4 = name.indexOf("a");
        boolean result5 = name.isEmpty();
        String result6= name.toUpperCase();
        String result7= name.toLowerCase();
        String result8 = name.replace("A", "k");


        System.out.println(result8);


    }
}