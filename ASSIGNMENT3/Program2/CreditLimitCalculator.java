import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        while (true) {
        
            System.out.println("Enter account number or enter 0 to exit ");
            int accountNumber = input.nextInt();
      
            if (accountNumber == 0) {
                System.out.println("Exit");
                break;
            }
            
            
            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            
            System.out.print("Enter total of all items charged this month: ");
            int totalCharges = input.nextInt();
            
            System.out.print("Enter total of all credits applied this month: ");
            int totalCredits = input.nextInt();
            
            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();
            
            
            int newBalance = beginningBalance + totalCharges - totalCredits;
            
            
            System.out.println("New balance for account " + accountNumber + " is: " + newBalance);
            
           
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }
        
        input.close();
    }
}
