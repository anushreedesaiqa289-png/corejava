package com.sunbeam.Ass1;


public class Ass2_Q1 {
    public static void main(String[] args) {
        System.out.println("=== Test Case 1: Valid Invoice Parameters ===");
        // Initializing with part number, description, 5 items, and ₹299.50 price
        Invoice invoice1 = new Invoice("HW-9921", "Heavy-Duty Hammer", 5, 299.50);
        displayInvoice(invoice1);

        System.out.println("\n=== Test Case 2: Invalid (Negative) Parameters ===");
        // Initializing with negative quantity (-3) and negative price (-12.0)
        Invoice invoice2 = new Invoice("SC-4401", "Steel Screws (Box)", -3, -12.0);
        displayInvoice(invoice2);

        System.out.println("\n=== Test Case 3: Mutating Values via Setters ===");
        // Changing data using setter methods to observe adjustments
        invoice2.setPartDescription("Premium Stainless Steel Screws");
        invoice2.setQuantity(20);    // Resetting to a valid quantity
        invoice2.setPricePerItem(15.75); // Resetting to a valid price
        displayInvoice(invoice2);
    }

    // Helper method to scannably display invoice properties
    private static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number      : " + invoice.getPartNumber());
        System.out.println("Description      : " + invoice.getPartDescription());
        System.out.println("Quantity Selected: " + invoice.getQuantity());
        System.out.println("Price Per Item   : ₹" + invoice.getPricePerItem());
        System.out.println("Total Amount Due : ₹" + invoice.getInvoiceAmount());
    }
}

