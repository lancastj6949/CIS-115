// John Lancaster
// M5CW2
// 3/27/2026
// This code calculates the total and average of five products
// Help lab note: 
// Any variable that isn't used yet, will give you a compilation error (those marked in yellow)

import java.util.Scanner;
public class M5CW2_Lancaster 
{
    
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int userInput = 1;
        Double first_item_price, second_item_price , third_item_price, fourth_item_price, fifth_item_price, total, average;
        
        // Repeat loop until you get a VALID price 
        do{
            
            System.out.print("Enter the price for item #1: ");
            first_item_price = k.nextDouble();

            // if invalid, tell them to repeat (same check as while)
            if (first_item_price <0 || first_item_price >10000) {
                System.out.println("Invalid price. Please display a value between 0 and 10000: ");
            
           
            }
        
        } while(first_item_price <0 || first_item_price >10000);

        do{
            
            System.out.print("Enter the price for item #2: ");
            second_item_price = k.nextDouble();

            // if invalid, tell them to repeat (same check as while)
            if (second_item_price <0 || second_item_price >10000) {
                System.out.println("Invalid price. Please display a value between 0 and 10000: ");
            
           
            }
        
        } while(second_item_price <0 || second_item_price >10000);


         do{
            
            System.out.print("Enter the price for item #3: ");
            third_item_price = k.nextDouble();

            // if invalid, tell them to repeat (same check as while)
            if (third_item_price <0 || third_item_price >10000) {
                System.out.println("Invalid price. Please display a value between 0 and 10000: ");
            
           
            }
        
        } while(third_item_price <0 || third_item_price >10000);

        do{
            
            System.out.print("Enter the price for item #4: ");
            fourth_item_price = k.nextDouble();

            // if invalid, tell them to repeat (same check as while)
            if (fourth_item_price <0 || fourth_item_price >10000) {
                System.out.println("Invalid price. Please display a value between 0 and 10000: ");
            
           
            }
        
        } while(fourth_item_price <0 || fourth_item_price >10000);

        do{
            
            System.out.print("Enter the price for item #5: ");
            fifth_item_price = k.nextDouble();

            // if invalid, tell them to repeat (same check as while)
            if (fifth_item_price <0 || fifth_item_price >10000) {
                System.out.println("Invalid price. Please display a value between 0 and 10000: ");
            
           
            }
        
        } while(fifth_item_price <0 || fifth_item_price >10000);

        
        
        total = (first_item_price + second_item_price + third_item_price + fourth_item_price + fifth_item_price);
        System.out.println("All prices entered successfully! ");
        System.out.println("The total price is " + total);
        average = (fifth_item_price + second_item_price + third_item_price + fourth_item_price + fifth_item_price/5);
        System.out.println("The average price is " + average);
        

    }


}
