import java.util.ArrayList;
import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
     //ArryList - is a colection of resizable arry.
        // Elemets can be added and removed after compilation phase
        //store referances data types.

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamberger");
        food.add("Hotdog");

        food.set(0,"Sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++ ){
            System.out.println(food.get(i));
        }

    }

}