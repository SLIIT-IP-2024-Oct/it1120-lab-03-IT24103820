import java.util.Scanner;
    public class IT24103820Lab3Q2 {
        public static void main(String[] args) {
           //Declare variables
           double monthlySalary, otAmount, otHours, otHourlyRate, totalSalary;

           //Create a scanner object to read input
           Scanner input = new Scanner(System.in);
           System.out.println("Enter monthly salary:");
           monthlySalary = input.nextDouble();
           System.out.println("Enter no of OT hours:");
           otHours = input.nextDouble();
           System.out.println("Enter OT Hourly Rate:");
           otHourlyRate = input.nextDouble();

           //Calculate the OT Amount
           otAmount = otHours * otHourlyRate;

           //Calculate the Total Salary
           totalSalary = monthlySalary + otAmount;

       System.out.println("Total Salary including OT is:" + totalSalary);
     }
}