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

         /* Logical Operators
                   && -  (AND) - Both Conditions Must Be true
                   || -  (OR)- At least one condition must be true
                   ! -  (NOT) - Reverse Boolean Value of a condition
         */
                //        int temp =15;
                //        if (temp>30){
                //            System.out.println("It is hot outside");
                //        }
                //        else if(temp>=20 && temp<=30){
                //            System.out.println("It is Warm Outside");
                //        }
                //        else{
                //            System.out.println("It is cold");
                //        }
                
                //        Scanner scanner = new Scanner(System.in);
                //        System.out.println("Your Are playing a game! Press q or Q for exit.");
                //        String res = scanner.next();
                //        if(res.equals("q") || res.equals("Q")){ // checking Strings ==
                //            System.out.println("You Exit the game");
                //        }else{
                //            System.out.println("You are still playing the game");
                //        }

                Scanner scanner = new Scanner(System.in);
                System.out.println("Your Are playing a game! Press q or Q for exit.");
                String res = scanner.next();
                if(!res.equals("q") && !res.equals("Q")){ // checking Strings ==
                    System.out.println("You are still playing the game");
                }else{
                    System.out.println("You Exit the game");
                }


                 // While Loop
                        //     - Executes a block of code as long as its Condition Remains true

                    //        Scanner scanner = new Scanner(System.in);
                    //        String name= "";
                    //
                    //       do{
                    //            System.out.print("Enter Youer name  - ");
                    //            name = scanner.nextLine();
                    //
                    //        } while(name.isBlank());
                    //        System.out.println("Hello "+name);
                    
                            // For Loop IN java - Execute a block of code a limited amount of time
                    //
                    //         for(int index=10; index>=0; index-=2){
                    //             System.out.println(index);
                    //         }
                    //        System.out.println("Happy New Year");
                    
                            // Nested Loops  - A loop inside a loop
                    
                    //        Scanner scanner = new Scanner(System.in);
                    //        int row;
                    //        int columns;
                    //        String symbol = "";
                    //        System.out.println("Enter No of rows : ");
                    //        row=scanner.nextInt();
                    //        System.out.println("Enter No of Columns: ");
                    //        columns= scanner.nextInt();
                    //        System.out.println("Enter Symbol to use : ");
                    //        symbol=scanner.next();
                    //
                    //        for (int i=1;i<=row;i++ ){
                    //            System.out.println();
                    //            for(int j=1;j<=columns;j++){
                    //                System.out.print(symbol);
                    //            }
                    //        }

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


         /*
                Wrapper Classes - Provides a way to use primitive data types as referance data types
                    referaance data types contain useful methods
                    can be used with collections (Arrylists)
        
                    Primitive       Wrapper
                    boolean         Boolean
                    char            Character
                    int             Integer
                    double          Double
                    // Autoboxing - the automatic conversion that the java compiler makes between the primitive and there corrosponding object wrapper class
        
              */
        
                Boolean a = true;
                Character b= '@';
                Integer c = 123;
                Double d = 3.14;
                String e = "Avishka";
        
                if (a==true){
                    System.out.println("This is true");
                }


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


            //For each loop = traversing technique to iterate through the elements in an arry/ collectoin
                     //   less steps, more readable
                    // less flexibility
            
                    //String[] animals ={"Cat","Dog","rat","Bird"};
                    ArrayList<String> animals = new ArrayList<String>();
            
                    animals.add("cat");
                    animals.add("rat");
                    animals.add("dog");
                    animals.add("bird");
            
                    for(String i :animals){
                        System.out.println(i);
                    }



        

                
                
        
        
        }
    }
