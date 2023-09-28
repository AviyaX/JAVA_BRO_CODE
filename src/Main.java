import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
      ///2D Array  -  an array of arrays

      String [][] cars =new String[3][3];
      cars[0][0] = "Camaro";
      cars[0][1] = "Corvette";
      cars[0][2] = "Silvarado";

      cars[1][0] = "Ranger";
      cars[1][1] = "mustang";
      cars[1][2] = "Camaro";

      cars[2][0] = "volvo";
      cars[2][1] = "tesla";
      cars[2][2] = "BMW";

      for(int i=0; i<cars.length;i++){
          System.out.println();
          for (int j=0; j<cars[1].length; j++){
              System.out.print(cars[i][j]+" ");
          }
      }




    }
}