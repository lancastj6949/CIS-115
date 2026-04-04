// John Lancaster
// M5CW2
// 3/27/2026
// This code coalculates the total and average of five products
// Help lab note:
// Any variable that isn't yused yet, will give you a complication error


import java.util.Scanner;
public class M9CW1_Lancaster
{

    public static void main(String[] args)
    {
       Scanner k = new Scanner(System.in);
       int userInput = 1;
       double first_item_price, total =0, average;

       // Repeat loop until you get a VALID price
       do{
           
           System.out.print("Enter the price for the item: ");
           first_item_price = k.nextDouble();

           // if invalid tell them to repeat (same check as while)
           while(first_item_price <0 || first_item_price >10000) {
            System.out.println("Invalid price. Please display a value between 0 and 10000: ");
             System.out.print("Enter the price for item #1: ");
             first_item_price = k.nextDouble();
             System.out.println("Enter the price for item #2: ");
             first_item_price = k.nextDouble();

           }
           userInput +=1;
           total += first_item_price;

       } while(userInput <=5);

    }
    
}