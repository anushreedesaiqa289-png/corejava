package com.sunbeam;

import java.util.Scanner;

public class Ass1_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double priceDosa = 50.0;
        double priceSamosa = 20.0;
        double priceIdli = 40.0;
        double priceVada = 35.0;
        double pricePoha = 25.0;
        double priceTea = 15.0;
        double priceCoffee = 20.0;
        double priceUttapam = 60.0;
        double priceMisal = 70.0;
        
        double totalBill = 0.0;
        int choice = 0;
        
        
        while (choice != 10) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Dosa        - ₹" + priceDosa);
            System.out.println("2. Samosa      - ₹" + priceSamosa);
            System.out.println("3. Idli        - ₹" + priceIdli);
            System.out.println("4. Vada        - ₹" + priceVada);
            System.out.println("5. Poha        - ₹" + pricePoha);
            System.out.println("6. Tea         - ₹" + priceTea);
            System.out.println("7. Coffee      - ₹" + priceCoffee);
            System.out.println("8. Uttapam     - ₹" + priceUttapam);
            System.out.println("9. Misal Pav   - ₹" + priceMisal);
            System.out.println("10. Generate Bill");
            
            System.out.print("Enter your choice (1-10): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 10.");
                scanner.next(); 
                continue;
            }
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 9) {
                System.out.print("Enter quantity: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid quantity!.");
                    scanner.next(); 
                    continue;
                }
                int quantity = scanner.nextInt();
                
                if (quantity <= 0) {
                    System.out.println("Quantity must be greater than 0!");
                    continue;
                }
                
                switch (choice) {
                    case 1: totalBill += priceDosa * quantity; 
                    		break;
                    case 2: totalBill += priceSamosa * quantity;
                    		break;
                    case 3: totalBill += priceIdli * quantity;
                    		break;
                    case 4: totalBill += priceVada * quantity; 
                    		break;
                    case 5: totalBill += pricePoha * quantity;
                    		break;
                    case 6: totalBill += priceTea * quantity; 
                    		break;
                    case 7: totalBill += priceCoffee * quantity;
                    		break;
                    case 8: totalBill += priceUttapam * quantity;
                    		break;
                    case 9: totalBill += priceMisal * quantity;
                    		break;
                }
                System.out.println("Item added successfully.");
                
            } else if (choice == 10) {
                System.out.println("Final Bill Amount: ₹" + totalBill);
            } else {
                System.out.println("Invalid choice! ");
            }
        }
        
        scanner.close();
    }
}

