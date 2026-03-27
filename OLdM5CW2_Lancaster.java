// John Lancaster
// M5CW2
// 3/25/2026
// This code calauclates the total and average of five products

// Commented out because it's erroring the build for the non old m5cw2
/*
import java.util.Scanner;
public class M5CW2_Lancaster 
{

    public static void main(String[] args)
    {  
        
        Scanner k = new Scanner(System.in);
        int userInput = 1;

        // do-while loop to ensure valid user input
      do{
         Double first_item_price, second_item_price, third_item_price, fourth_item_price, fifth_item_price, total, average;
         System.out.println("Enter the price for item #1: ");
         first_item_price = k.nextDouble();
        while(first_item_price <0 || first_item_price >10000)
           System.out.println("Invalid price. Please display a value between 0 and 10000: ");
           System.out.println("Enter the price for item #1: ");
           first_item_price = k.nextDouble();
            
        }


        if(first_item_price >0 || first_item_price <10000)
        System.out.println("Enter the price for item #2: ");
         second_item_price = k.nextDouble();
         System.out.println("Enter the price for item #3: ");
         third_item_price = k.nextDouble();
         System.out.println("Enter the price for item #4: ");
         fourth_item_price = k.nextDouble();
         System.out.println("Enter the price for item #5: ");
         fifth_item_price = k.nextDouble();
         total = (first_item_price + second_item_price + third_item_price + fourth_item_price +fifth_item_price);
         System.out.println(" All prices entered successfully! ");
         System.out.println("The total is " + total);
         average = (first_item_price + second_item_price + third_item_price + fourth_item_price +fifth_item_price/5);
         System.out.println("The average is " + average);
    
        } while(userInput > 0 && userInput <10000);
         System.out.println("you entered a valid number: " + userInput);
 
    
}
*/