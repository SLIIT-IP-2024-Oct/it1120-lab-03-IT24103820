import java.util.Scanner;
    public class IT24103820Lab3Q3 {
        public static void main(String[] args) {

           //Declare variables and initialize variables
           int amount = 0;
           int count5000 = 0;
           int count1000 = 0; 
           int count500 = 0;
           int count200 = 0; 
           int count100 = 0;
           int count50 = 0; 
           int count20 = 0; 
           int count10 = 0;
           int count05 = 0; 
           int count02 = 0;
           int count01 = 0; 

           //Create a scanner object to read input
           Scanner input = new Scanner(System.in);
           
           System.out.println("Enter the rupee amount:");
           amount = input.nextInt();

           //if Amount entered is 2754
           
           //Calculate 5000 notes
           count5000 = amount / 5000;
           amount = amount % 5000;

           //Calculate 1000 notes
           count1000 = amount / 1000;
           amount = amount % 1000;

           //Calculate 500 notes
           count500 = amount / 500;
           amount = amount % 500;

           //Calculate 200 notes
           count200 = amount / 200;
           amount = amount % 200;

           //Calculate 100 notes
           count100 = amount / 100;
           amount = amount % 100;

           //Calculate 50 notes
           count50 = amount / 50;
           amount = amount % 50;

           //Calculate 20 notes
           count20 = amount / 20;
           amount = amount % 20;
 
          //Calculate 10 notes
           count10 = amount / 10;
           amount = amount % 10;

           //Calculate 05 coins
           count05 = amount / 05;
           amount = amount % 05;

           //Calculate 02 coins
           count02 = amount / 02;
           amount = amount % 02;

           //Calculate 01 coins
           count01 = amount / 01;
           amount = amount % 01;

       System.out.println("5000 notes:" + count5000);
       System.out.println("1000 notes:" + count1000);
       System.out.println("500 notes:" + count500);
       System.out.println("200 notes:" + count200);
       System.out.println("100 notes:" + count100);
       System.out.println("50 notes:" + count50);
       System.out.println("20 notes:" + count20);
       System.out.println("10 notes:" + count10);
       System.out.println("05 coins:" + count05);
       System.out.println("02 coins:" + count02);
       System.out.println("01 coins:" + count01);

     }
}










