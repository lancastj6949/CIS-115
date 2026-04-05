
// John Lancaster
// 4/4/2026
// M5HW1
// Calculates a students average and letter grade 



import java.util.Scanner;
public class M5HW1_Lancaster 
{
    public static void main(String[] args)
    {    
        Scanner k = new Scanner(System.in);
       double grade_amount, first_grade, second_grade, third_grade, average;
       System.out.println("Enter the amount of grades you want averaged: ");
       grade_amount = k.nextDouble();
       if (grade_amount >=3)
        {
         do{
                System.out.println("Enter grade #1: ");
                first_grade = k.nextDouble();
                // if invalid, tell them to repeat (same check as while)
                if(first_grade <0 || first_grade >100){
                    System.out.println("Invalid grade. Please enter a value between 0 and 100: ");
                }
            
            } while(first_grade <0 || first_grade >100);
            do{
                System.out.println("Enter grade #2: ");
                second_grade = k.nextDouble();
                if(second_grade <0 || second_grade >100){
                    System.out.println("Invalid grade. Please enter a value between 0 and 100: ");
                }
            } while(second_grade <0 || second_grade >100);
            do{
                System.out.println("Enter grade #3: ");
                third_grade = k.nextDouble();
                if(third_grade <0 || third_grade >100){
                    System.out.println("Invalid grade. Please eneter a value between 0 and 100: ");

                }
            }while(third_grade <0 || third_grade >100);
            average=(first_grade +second_grade +third_grade/3);
            System.out.println("The average is "+ average);
            char grade;
            if(average >=90)
                {
                    grade ='A';
                }
            else if(average >=80)
                {
                     grade = 'B';
                }
            else if(average >=70)
                {
                    grade ='C';
                }
            else if(average >=60)
                {
                    grade = 'D';
                }
            else
                {
                    grade ='F';
                }
                System.out.println(" grade is "+ grade);

        }
        if(grade_amount<3 && grade_amount >1);
          do{
                System.out.println("Enter grade #1: ");
                first_grade = k.nextDouble();
                // if invalid, tell them to repeat (same check as while)
                if(first_grade <0 || first_grade >100){
                    System.out.println("Invalid grade. Please enter a value between 0 and 100: ");
                }
            
            } while(first_grade <0 || first_grade >100);
            do{
                System.out.println("Enter grade #2: ");
                second_grade = k.nextDouble();
                if(second_grade <0 || second_grade >100){
                    System.out.println("Invalid grade. Please enter a value between 0 and 100: ");
                }
            } while(second_grade <0 || second_grade >100);
              average=(first_grade +second_grade/2);
            System.out.println("The average is "+ average);
            char grade;
            if(average >=90)
                {
                    grade ='A';
                }
            else if(average >=80)
                {
                     grade = 'B';
                }
            else if(average >=70)
                {
                    grade ='C';
                }
            else if(average >=60)
                {
                    grade = 'D';
                }
            else
                {
                    grade ='F';
                }
                System.out.println(" grade is "+ grade);
        
                
            
            
    }                            
                
}   

