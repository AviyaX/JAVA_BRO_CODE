# JAVA_BRO_CODE
Learning Java With Bro Code Channel In Youtube  


    public class Main {
        public static void main(String[] args) {

            **//This is singe line comment in java**
                System.out.print("Hello and welcome!");
                System.out.print("My Name Is Avishka Induwara"); //print prints in same line
                System.out.println("I Love pizza "); // println prints on separate line
                System.out.print("My name is Avishka\nInduwara");
        
                /* This is multi line comment in java
                **Escape Sequences**
                    \n - New Character (go to new line)
                    \t -  Empty Space (Tab)
                    "\\whatever\\" - \whatever\
                 */
        
        
             ** //Variables**
                    int x; //declaration
                    x=123; // Assignment
                    long y = 2132131267312L;
                    float z =3.14f;
                    double a=1.34;
                    boolean b=true;
                    String name ="Avishka Induwara";
                  
                    System.out.println("My Number Is : "+x);
                    System.out.println("This is a long number : "+y);
                    System.out.println("This is a float value "+z);
                    System.out.println("This is a double value: " +a);
                    System.out.println("This is a boolean Value: " +b);
                    System.out.println("This is my Name using Strig : "+name);
        
              /**/Swap 2 Variables // import java.util.Scanner; // including Scanner**
                    String x= "water";
                    String y="Cool-Aid";
                    String temp;
                    temp=x;
                    x=y;
                    y=temp;
                    System.out.println("X: "+x);
                    System.out.println("Y: "+y);
        
               **//User Inputs In Java**
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
        
              **//Expressions In Java =  Operands & Operators**
                    //Operands = values, Variables, numbers, quantity
                    // Operators - + - * / %
                    
                double friends =10;
        
                    //friends= friends+1;   // Addition
                    //friends = friends -1; // Sub
                    //friends =friends *2;   //Multiply
                    // friends =friends / 2;    // Divide
                    //friends= friends %2; // Module - remaining after divide
                      friends = (double) friends / 3;    // onvert into different data type
        
                System.out.println("you Have " +friends +" now");
        
        
            **//Graphical user Interface In Java   - import javax.swing.JOptionPane;**
                String name = JOptionPane.showInputDialog("Enter Your Name:");
                JOptionPane.showMessageDialog(null,"Hello "+name);
        
                System.out.println("you Have " +friends +" now");
                int age = Integer.parseInt( JOptionPane.showInputDialog("Enter Your Age")); //converting string to int
                JOptionPane.showMessageDialog(null,"Your Age is : "+age);
        
                double height = Double.parseDouble( JOptionPane.showInputDialog("Enter Your Height")); //converting string to int
                JOptionPane.showMessageDialog(null,"Your height is : "+height+"cm");
        
            **//Mathematics Methods**
                double x = 3.14;
                double y = 10;
        
                double z = Math.max(x,y);    //maximum
                double a = Math.min(x,y);   // minimum
                double abs = Math.abs(y);   //absolute
                double sqrt = Math.sqrt(y);  //square root
                double round = Math.round(x); // roundoff
                double ceil = Math.ceil(x); //Rounded Up
                double floor = Math.floor(x); //Rounded down
        
                System.out.println(z);
                System.out.println(a);
                System.out.println(abs); //absolute value no without -
                System.out.println(sqrt);
                System.out.println(round);
                System.out.println(ceil);
                System.out.println(floor);
        
        
            **//Hypotenuse Of a triangle**
        
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

        //Random Values IN Java
            Random random = new Random();
            int x = random.nextInt(6)+1;
            double y = random.nextDouble(6)+1;
            System.out.println(y);

         //If Statements - Perform a block of code if it;s condition evaliate to be true

                Scanner scanner = new Scanner(System.in);
        
                System.out.println("Enter Your Age : ");
                int age = scanner.nextInt();
                if(age>=75){
                    System.out.println("You Are OLD");
        
                }
                else if(age>=18) {
                    System.out.println("You are an Adult");
        
                }
                else{
                    System.out.println("Your Are NoT Adult ");
                }

        // Switch cases
           // - Statements that allows a variable to be tested for equality against a list of values

        String day  = "Monday";
        switch(day){
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("Thai Is Not A Date");
        }


                
                
        
        
        }
    }
