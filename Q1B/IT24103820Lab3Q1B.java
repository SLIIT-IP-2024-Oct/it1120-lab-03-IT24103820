import java.util.Scanner;
  public class IT24103820Lab3Q1B {
     public static void main(String[] args) {
           //Declare variables
           double priceof1kg, noOfKg, totalAmount, discountAmount, finalAmount;

           //Declare and initialize variables
           double discount = 0.10;
 
           // create a scanner object to read input
           Scanner input = new Scanner(System.in);
           System.out.println("priceof1kg:");
           priceof1kg = input.nextDouble();
           System.out.println("noOfkg:");
           noOfKg = input.nextDouble();  

           //calculate the total amount
           totalAmount = priceof1kg * noOfKg;

           //calculate the discount(10% of the bill)
           discountAmount = totalAmount * discount;

           //Calculate the amount have to pay
           finalAmount = totalAmount - discountAmount;
                   
           System.out.println("Final amount is:" + finalAmount);
        }
     }      


           

