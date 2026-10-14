package com.sunbeam.Ass3;

public class Ass2_Q3 {
    public static void main(String[] args) {
        Date date = new Date(10, 25, 2022);
        date.displayDate();

        // You can also use the set methods to change the date
        date.setMonth(12);
        date.setYear(2023);
        date.displayDate();
    }
}
