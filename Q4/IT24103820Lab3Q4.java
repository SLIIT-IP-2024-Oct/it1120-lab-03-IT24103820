import java.util.Scanner;
    public class IT24103820Lab3Q4 {
        public static void main(String[] args) {

           //Declare variables
           int number, digit1, digit2, digit3, digit4, digit5;

           //Create a scanner object to read input
           Scanner input = new Scanner(System.in);
           System.out.println("Enter five digit number:");
           number = input.nextInt();

           //if the number entered is 52348

           //The highest place value digit
           digit1 = number / 10000;
           number = number % 10000;

           //The 2nd highest place value digit
           digit2 = number / 1000;
           number = number % 1000;

           //The 3rd highest place value digit
           digit3 = number / 100;
           number = number % 100;

           //The 4th highest place value digit
           digit4 = number / 10;
           number = number % 10;

          //Last digit
          digit5 = number;

          //Print each digit seperately
          System.out.println();
          System.out.print(digit1 + " ");
          System.out.print(digit2 + " ");          
          System.out.print(digit3 + " ");
          System.out.print(digit4 + " ");
          System.out.print(digit5);
          System.out.println();

    }
}

