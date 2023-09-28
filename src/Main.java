import java.util.ArrayList;
import java.util.Scanner; // including Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //2D Array LIst In Java  - a dynamic list of lists
        // You can change the size

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("GArlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("tomato");
        producelist.add("zucchini");
        producelist.add("pepers");

        ArrayList<String> drinklist = new ArrayList<>();
        drinklist.add("soda");
        drinklist.add("coffe");


        groceryList.add(bakeryList);
        groceryList.add(producelist);
        groceryList.add(drinklist);


        System.out.println(groceryList.get(1).get(1));
        System.out.println(groceryList.get(2).get(1));



    }

}