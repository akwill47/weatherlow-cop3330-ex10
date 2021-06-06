package ex10.base;
import java.util.Scanner;
import java.util.Formatter;
/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int size = 3;
        int[] price= new int[size];
        int[] quantity = new int[size];

        myApp.readInput(price,quantity,size);
        String output = myApp.doMath(price,quantity,size);
        myApp.displayOutput(output);
    }


    private void  readInput(int[] price, int[] quantity,int size){
        for(int i=0;i<size;i++){
            System.out.printf("Enter the price of item %d: ", i+1);
            price[i]=in.nextInt();
            System.out.printf("Enter the quantity of item %d: ", i+1);
            quantity[i]=in.nextInt();
        }
    }

    private String doMath(int[] price, int[] quantity,int size){
        float sum=0;
        float tax;
        float total=0;
        for(int i=0;i<size;i++){
            for (int j=0;j<quantity[i];j++) {
                sum += (price[i]);
            }
        }
        tax=(float)(sum * 0.055);
        total= tax + sum;
        return "Subtotal: $" + String.format("%.2f",sum) + "\nTax: %" + String.format("%.2f",tax) + "\nTotal: %" + String.format("%.2f",total);
    }
    private void displayOutput(String output){
        System.out.println(output);
    }

}
