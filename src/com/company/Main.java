package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer= new Printer(100,0,true);

        System.out.println("Is printer duplex? " + printer.getIsDuplex());
        System.out.println("Toner level is: " + printer.getTonerLevel());
        System.out.println("Number of pages printed is: " + printer.getNumOfPagesPrinted());

        printer.printPage();

        System.out.println("Toner is empty? " + printer.tonerIsEmpty());

        Printer emptyPrinter= new Printer(0, 0, false);
        System.out.println("****************************");
        emptyPrinter.tonerFill(20);
    }
}
