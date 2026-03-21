// John Lancaster
// M4 Hands-On Test
// 3/21/2026
// Codes for differnet sets of temperatures


import java.util.Scanner;
public class M4Test_Lancaster 
{
    public static void main(String[] args)
  {
     Double freezing_temperature, cold_temperature, mild_temperature, warm_temperature, hot_temperature;
     Scanner k = new Scanner(System.in);
     System.out.println("Enter the temperature in fahrenheit: ");
     freezing_temperature = k.nextDouble();
     if (freezing_temperature < 32)
        System.out.println("Freezing-bundle up: ");
      System.out.println("Enter the temperature again in fahrenheit: ");
      cold_temperature = k.nextDouble();
     if(cold_temperature <= 50)
        System.out.println("Cold-wear a jacket: ");
     System.out.println("Enter the temperature a third time in fahrenheit: ");
     mild_temperature = k.nextDouble();
     if(mild_temperature <= 70)
        System.out.println("Mild-a light sweater will do: ");
     System.out.println("Enter the temperature a fourth time in fahrenheit: ");
     warm_temperature = k.nextDouble();
     if(warm_temperature <= 90)
        System.out.println("Warm-enjoy the day: ");
     System.out.println("Enter the temperature a fifth time in fahrenhiet: ");
     hot_temperature = k.nextDouble();
     if(hot_temperature > 90)
        System.out.println("Hot-stay hydrated: ");
   }

}
