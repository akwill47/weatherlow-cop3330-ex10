package ex10.base;
import java.util.Scanner;
import java.util.Formatter;
/*Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system.
Prompt for the prices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate.
Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
Challenges
Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
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
