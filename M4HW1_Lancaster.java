// John Lancaster
// M4HW1
// 3/20/2026
// This program calculates the monthly salary
import java.util.Scanner;
public class M4HW1_Lancaster
{

   public static void main(String[] args)
   {
      String name;
      double base_salary, average, widgets_sold, widgets_returned, net_widgets_sold, widgets_sales_amount, commission_rate, commission_amount, monthly_salary;
      final double SALESPRICE = 4.79;
      final double BASESALARY = 2000;
      Scanner k = new Scanner(System.in);

      System.out.print("Enter Name: ");
      name = k.nextLine();
      System.out.print("Enter widgets sold: ");
      widgets_sold = k.nextDouble();
      System.out.print("Enter widgets returned: ");
      widgets_returned = k.nextDouble();
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
     System.out.println("Net Widgets Sold: " + net_widgets_sold);
     System.out.println("Widget Sales Amount: " + widgets_returned);
     System.out.println("Commission Amount: " + commission_amount);
     System.out.println("Monthly salary: " + monthly_salary);


    }
  }