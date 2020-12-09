//Eldana Tadesse
//etadess1@umbc.edu
//A program forum that connects investors and third world country businesses where ideas can be shared
//One search engine or tool that connects all of African businesses + integrates them for the world.
//It allows an easy one step process to make it easier for outsider inventors .

import java.util.Random;
import java.util.Scanner;

public class Main<cars> {
    public Main(int i) {
    }

    public Main() {

    }

    public static void main(String[] args) {
        //* scanner
        Scanner invest = new Scanner(System.in);
        //char name1, name2;
        //variables
        System.out.println("Enter name:");
        String name = invest.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Enter business name:");
        String businessname = invest.nextLine();
        System.out.println("Name: " + name);
        //int age = invest.nextInt();
        //System.out.println("Age: " + age);


//3 switch statement
        System.out.println("Enter business respective number");
        int option = invest.nextInt();
        int result = option % 12;
        switch (option % 12) {
            case 0:
                System.out.println("Agriculture");
                break;
            case 1:
                System.out.println("Technology");
                break;
            case 2:
                System.out.println("Automobile");
                break;
            case 3:
                System.out.println("Education");
                break;
            case 4:
                System.out.println("Waste + Env");
                break;
            case 5:
                System.out.println("Fashion and Apparel");
                break;
            case 6:
                System.out.println("Outsourcing");
                break;
            case 7:
                System.out.println("Film and Media");
                break;
            case 8:
                System.out.println("Healthcare");
                break;
            case 9:
                System.out.println("Digital Finance ");
                break;
            case 10:
                System.out.println("Music");
                break;
            case 11:
                System.out.println("Resorts, Apartment, Hotels");
                break;
        }

// Constants
        final char var5 = 'A';
        final short var6 = 'B';
        System.out.println("Loading : " + var5);
        System.out.println("Loading : " + var6);

//4 conditional operator
        int a = 120;
        if (a < 100) {
            System.out.println("Visa Eligibility Confirmed");
        } else if (a == 100) {
            System.out.println("Eligibility Denied Check Resources");

// 5 Operators(logical)
            boolean t = true;
            boolean y = false;
            System.out.println("Based on analytics this business venture is a great match");
        }

//6 String class method MANY options used length
            String namelength = "Amazon.Inc";
            int len = namelength.length();
            System.out.println("You get 5 free complimentary hotel stays " + len);

 //7 Math class method
        double x = 22;
            double  y = 55;
//return the square root of y
            System.out.println("Square root of y is: " + Math.sqrt(y));

            //8 Loop use to make a diamond logo
      //  for (int i = 1; i <= 5; i++) {
            //   for (int j = 1; j <= i; j++) {
            //     System.out.print("* ");
       // }
       // System.out.println();
               int rows = 3;
                for (int i = 0; i<= rows-1 ; i++)
                {
                    for (int j=rows-1; j>=i; j--)
                    {
                        System.out.print(" ");
                    }
                    for (int k=0; k<=i; k++)
                    {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                for (int i= 0; i<= rows-1 ; i++)
                {
                    for (int j=-1; j<=i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k=0; k<=rows-2-i; k++)
                    {
                        System.out.print("*" + " ");
                    }
                    System.out.println();



 //9+10

        int e = 10;
                    int k = 20;

         String b;
                    return;//9 Return value from method

                }
        }

        //10 Method overloading,
        static class Adder{
static int add(int a, int b){return a+b;}
static double add(double a, double b){return a+b;}


}}

//12+13
        class object {
            final Main myObj1 = new Main();  // Object 1
            final Main myObj2 = new Main();  // Object 2
            //System.out.println(myObj1.x);
        }

//14
        class IO {
            int x;  // Create a class attribute

            //Create a class constructor for the Main class
            public IO() {
                x = 5;  // Set the initial value for the class attribute x}
//  public static void main(String[] args) {
                Main myObj = new Main(); // Create an object of class Main (This will call the construc
//System.out.println(myObj.x); // Print the value of x


//17
      class Investements {
      protected String brand = "Ownership Investments";
      public void Businesscapital() {
      System.out.println("Risk or Reward");
      class Money extends Investements {
      private String Funds = "Hedge Funds";    // Car attribute
      public void main(String[] args) {
//object
       Money cash = new Money();
       cash.Businesscapital();
       System.out.println(cash.brand + " " + cash.Funds);


//19
   Random rand = new Random();
   int upperbound = 25;
   int int_random = rand.nextInt(upperbound);
   System.out.println("Random 0 to" + (upperbound - 9) + " : " + int_random);





//  Constructor with a parameter
//public class bot(int x) {
//this.x = x;
//}
//
//  // Call the constructor
//  public static void main(String[] args) {
//Main myObj = new Main(5);
//    System.out.println("Value of x = " + myObj.x);


//      22 Modifier . private



      }
                            }
                        }
                    }
                }
            }













