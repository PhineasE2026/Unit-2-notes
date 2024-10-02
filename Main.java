import java.util.Scanner; // import the Scanner. It will scan everything. Be careful.

public class Main {

   public static void main(String []args) {
      System.out.println("Testing methods that RETURN values........");
      
      // construct a scanner object. it will scan everything.
      // note: System.in() is the computer's keyboard. The scanner is going to scan the keyboard.
      /* Scanner scan = new Scanner(System.in); 

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
      */

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

      // string methods
      // length() returns number of char
      int messageLength = message.length();
      System.out.println("Length: " + messageLength);
      int indexMessage = message.length() - 1;
      // .LENGTH()-1 REPRESENTS FINAL INDEX.
      System.out.println("Finale indexe : " + indexMessage);

      // use index to access character(s) 
      // susbtring(int,int)
      String firstWord = message.substring(0,4);
      System.out.println(firstWord);

      // .substring(int) returns a String from first index to end of string
      String lastWord = message.substring(8);
      System.out.println(lastWord);
      
      // .indexOf(String) returns an int representing the index
      // or position of the String argument
      int indexOfCool = message.indexOf("cool");
      System.out.println(indexOfCool);

      // oort clud
      // not on AP exam but useful
      // i am not going to study this
      System.out.println(message.toUpperCase());
      System.out.println(message.toLowerCase());

      // .equals compares a parameter String to the calling String object
      // then returns a boolean representing whether they are equal
      String s1 = "I am tired.";
      String s2 = "I am a frog";
      boolean isEqual = s1.equals(s2);
      System.out.println(isEqual);
      int compareEquality = s1.compareTo(s2);
      System.out.println(compareEquality);
      boolean isEqualAgain = s1.equals("I am tired.");
      System.out.println(isEqualAgain);
      
      String a = "ape";
      String z = "zebra";

      // .compareTo returns a positive integer if this string > other string
      // returns a negative int if this string < other string
      // returns zero if alphabetically equivalent
      System.out.println(a.compareTo(z)); // -25
      System.out.println(z.compareTo(a)); // 25


   }
}
