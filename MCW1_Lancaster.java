
// John Lancaster
// M5CW1
// 3/25/2026
// Code adds five numbers and displays total

import java.util.Scanner;
public class MCW1_Lancaster
{
    public static void main(String[] args)
    {
       double first_value, total = 0;
       Scanner k = new Scanner(System.in);
       // Loop from 1 to 8
       for(int i =1; i <- 8; i++){
        System.out.println("Enter #" +i +"value: ");
        first_value = k.nextDouble();
        
        total += first_value;

       }
       System.out.println("The total is " + total);
       k.close();
    }
}
