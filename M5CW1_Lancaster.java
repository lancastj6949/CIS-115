// John Lancaster
// M5CW1
// 3/25/2026
// Code adds five numbers and displays total

import java.util.Scanner;
public class M5CW1_Lancaster 
{
     
    public static void main(String[] args)

    {
        Double first_value, second_value, third_value, fourth_value, fifth_value, total;
        // Loop from 2 to 8
        for (int i = 2; i <= 8; i++){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter first value: ");
        first_value = k.nextDouble();
        System.out.println("Enter second value: ");
        second_value = k.nextDouble();
        System.out.println("Enter the third value: ");
        third_value = k.nextDouble();
        System.out.println("Enter the fourth value: ");
        fourth_value = k.nextDouble();
        System.out.println("Enter the fifth value: ");
        fifth_value = k.nextDouble();
        total = (first_value + second_value + third_value + fourth_value + fifth_value);
        System.out.println("The total is " + total);
        
    }
}
    
}
