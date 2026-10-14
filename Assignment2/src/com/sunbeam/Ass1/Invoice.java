package com.sunbeam.Ass1;

public class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize all four variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        // Handle validation during initialization
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // --- Getter and Setter Methods ---

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // Enforce validation rule
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        // Enforce validation rule
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // --- Core Methods ---

    // Calculates the invoice amount
    public double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }
}

