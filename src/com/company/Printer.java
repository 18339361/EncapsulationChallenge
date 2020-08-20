package com.company;

public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numOfPagesPrinted, boolean isDuplex){
        if(tonerLevel<=100 && tonerLevel>0){
            this.tonerLevel=tonerLevel;
        }
        this.numOfPagesPrinted=numOfPagesPrinted;
        this.isDuplex=isDuplex;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public int getNumOfPagesPrinted(){
        return this.numOfPagesPrinted;
    }

    public boolean getIsDuplex(){
        return this.isDuplex;
    }

    public void printPage(){
        numOfPagesPrinted++;
        System.out.println("The total number of pages printed is: " + numOfPagesPrinted);
        reduceTonerLevel(1);
    }

    public void reduceTonerLevel(int reduce){
        tonerLevel-=reduce;
    }

    public boolean tonerIsEmpty(){
        if(tonerLevel<=0){
            return true;
        }
        return false;
    }

    public void tonerFill(int toner){
        System.out.println("Current toner level: " + tonerLevel);
        if(tonerLevel+toner<=100){
            this.tonerLevel+=toner;
        }
        System.out.println("New toner level: " + tonerLevel);
    }
}
