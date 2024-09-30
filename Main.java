import java.util.Scanner; // import the Scanner. It will scan everything. Be careful.

public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that RETURN values........");
      
      // construct a scanner object. it will scan everything.
      // note: System.in() is the computer's keyboard. The scanner is going to scan the keyboard.
      Scanner scan = new Scanner(System.in); 

      // take input with scanner methods
      // take string input with the nextLine method. the scanner will scan this too.
      System.out.println("Enter text: ");
      String inputStr = scan.nextLine();
      // take int input
      System.out.println("Enter whole number: ");
      int inputInt = scan.nextInt();
      // take double input
      System.out.println("Enter a decimal number: ");
      double inputDouble = scan.nextDouble();

      // handle the user input (do something WITH the VALUES).
      // print it. Use the value in a print statement.
      System.out.println("You entered: " + inputStr);
      // u cnan use values in expresino
      double sum = inputInt + inputDouble;

      // string class
      // original way of constructing a string object
      String message = new String("APCS is cool");
      System.out.println(message);
      // shortcut way of creating string
      String greeting = "Helo coderes"; // texr inn quotes is a" string literal"
      System.out.println(greeting);

      // concatenate two or more string objects
      String concatenated = greeting + message;
      System.out.println(concatenated);
      System.out.println(greeting + " " + message);
      // can combine String vari ables and string Literal.s
      String matlock = greeting + " " + message + " " + concatenated;
      System.out.print(matlock);
      System.out.println("I am " + 52 + " years old");
      System.out.println("12" + 4 + 3); // 1243
      System.out.println("12" + (4 + 3)); // 127
      System.out.println(12 + 4 + 3); // Not concatenation
      System.out.println(("12") + 4 + 3); // 1243

   }
}
