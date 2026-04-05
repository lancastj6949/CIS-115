
// John Lancaster
// M5HW2
// 4/5/2026
// This program calculates a salesperson's monthly commission and total salary based off widgets sold



import java.util.Scanner;
public class M5HW2_Lancaster
{

   public static void main(String[] args)
   {
      String name, month;
      double First_week, Second_week, Third_week, Fourth_week, base_salary, average, widgets_sold, widgets_returned, net_widgets_sold, widgets_sales_amount, commission_rate, commission_amount, monthly_salary, first_week, second_week, third_week, fourth_week, will_continue;
      final double SALESPRICE = 4.79;
      final double BASESALARY = 2000;
      Scanner k = new Scanner(System.in);

      // loop from 0 to 299
      for(int i=0; i <= 299; i++ ){
        System.out.print("Enter Name: ");
      name = k.nextLine();
      System.out.print("Enter the month: ");
      month = k.nextLine();
        System.out.println("Enter value for week 1: ");
        first_week = k.nextDouble();
        System.out.println("Enter value for week 2: ");
        second_week = k.nextDouble();
        System.out.println("Enter value for week 3: ");
        third_week = k.nextDouble();
        System.out.println("Enter value for week 4: ");
        fourth_week = k.nextDouble();
        widgets_sold =(first_week + second_week + third_week +fourth_week/4);
        System.out.println("The widgets sold is: "+ widgets_sold);
         System.out.println("Enter returned value for week 1: ");
        First_week = k.nextDouble();
        System.out.println("Enter returned value for week 2: ");
        Second_week = k.nextDouble();
        System.out.println("Enter returned value for week 3: ");
        Third_week = k.nextDouble();
        System.out.println("Enter returned value for week 4: ");
        Fourth_week = k.nextDouble();
        widgets_returned= (First_week + Second_week + Third_week + Fourth_week);
        System.out.println("The widgets returned is: "+ widgets_returned);
        net_widgets_sold = widgets_sold - widgets_returned;
      widgets_sales_amount = net_widgets_sold * SALESPRICE;
      if (net_widgets_sold >= 0 && net_widgets_sold <= 100)
        commission_rate = 0.1;
      else if (net_widgets_sold <= 199)
        commission_rate = 0.15;
      else if (net_widgets_sold <= 299)
        commission_rate = 0.20;
      else
        commission_rate = 0.25;
     commission_amount = commission_rate * widgets_sales_amount;
     monthly_salary = commission_amount + BASESALARY;
     System.out.println("Sales Person: " + name);
     System.out.println("Month: " + month);
     System.out.println("Net Widgets Sold: " + net_widgets_sold);
     System.out.println("Widget Sales Amount: " + widgets_returned);
     System.out.println("Commission Amount: " + commission_amount);
     System.out.println("Monthly salary: " + monthly_salary);
     do{
          System.out.println("Do you want to run it again? 1 for yes, -1 for no");
          will_continue = k.nextDouble();
          if(will_continue <= -1)
            System.out.println(" Program comeplete, thank you: ");
          }
          while(will_continue <= -1);
          if(will_continue <=1);
          name = k.nextLine();
          
          

        
      } 

      

     
      


    }
  }