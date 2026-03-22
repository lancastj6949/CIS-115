// John Lancaster
// M4 Hands-On Test
// 3/21/2026
// This program codes for differnet sets of temperatures


import java.util.Scanner;
public class M4Test_Lancaster 
{
    public static void main(String[] args)
  {
     Double temperature;
     Scanner k = new Scanner(System.in);
     System.out.println("Enter the temperature in fahrenheit: ");
     temperature = k.nextDouble();
     if( temperature < 32 && temperature >0)
      System.out.println("Freezing-bundle up: ");
    else if(temperature >=32 && temperature <=50)
      System.out.println("Cold-wear a jacket: ");
   else if(temperature >=51 && temperature <= 70)
      System.out.println("Mild-a light sweater will do: ");
   else if(temperature >= 71 && temperature <=90)
      System.out.println("Warm-enjoy the day: ");
   else if(temperature >90)
      System.out.println("Hot-stay hydrated: ");
   else if(temperature <0 && temperature <32)
      System.out.println("Unusual input detected. Double-check your entry: ");
   }

}
