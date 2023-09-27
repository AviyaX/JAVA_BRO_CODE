import java.util.Scanner; // including Scanner

public class Main {
    public static void main(String[] args) {
        //User Inputs In Java
        Scanner scanner = new Scanner(System.in); // Creating Object

        System.out.println("What Is your Name: ");
        String name = scanner.nextLine(); //nextLine will use for string
        System.out.println("How Old Are You: ");
        int age = scanner.nextInt(); //nextInt will use for int
        scanner.nextLine(); //Clearing Scanner
        System.out.println("what is Your Favourite Food");
        String food =scanner.nextLine();


        System.out.println("Hello My Name is "+name);
        System.out.println("I'm "+age+" Years Old");
        System.out.println("My favourite food is : "+food);





    }
}