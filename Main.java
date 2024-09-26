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
      int sum = inputInt + inputDouble;
   }
}
