import java.util.Scanner;
  public class IT24103820Lab3Q1A {
     public static void main(String[] args) {
           //Declare variables
           double priceof1kg, noOfKg, totalAmount;
 
           // create a scanner object
           Scanner input = new Scanner(System.in);
           System.out.println("priceof1kg:");
           priceof1kg = input.nextDouble();
           System.out.println("noOfkg:");
           noOfKg = input.nextDouble();  

           //calculate the total amount
           totalAmount = priceof1kg * noOfKg;
          
           System.out.println("Total amounnt is:" + totalAmount);
        }
     }      


           

