import java.util.Scanner;
import java.util.Set;

public class M4CW1_Lancaster {
    public static void main(String[]args){
      // Variables
      //Declare Integer majors         // Number of CS majors
      int majors;
      //Declare Integer nonmajors      // Number of nonmajors
      int nonmajors;
      //Declare Real total             // Total number of students
      double total;
      //Declare Real percentMajors     // Percentage of CS majors
      double percentMajors;
      //Declare Real percentNonmajors  // Percentage of nonmajors
      double percentNonmajors;

      // Get the number of majors.
      // Display "Enter the number of students majoring in CS:"
      System.out.println("Enter the number of students majoring in CS:");
      //Input majors

      Scanner keyboard = new Scanner(System.in);
      majors=keyboard.nextInt();

      // Get the number of nonmajors.
      // Display "Enter the number of non-computer science students:"
      System.out.println("Enter the number of non-computer science students:");
      //Input nonmajors

       
      nonmajors = keyboard.nextInt();

      // Calculate the total number of students.
      total = majors + nonmajors;
        
      //Calculate the percentage of majors.
      percentMajors = majors / total * 100;

      // Calculate the percentage of nonmajors.
      percentNonmajors = nonmajors / total * 100;

      // Display the percentage of majors.
      // Display "Majors: ", percentMajors, "%"
      System.out.println("Majors");
      System.out.println(percentMajors);

      // Display the percentage of nonmajors.
      // Display "Nonmajors: ", percentNonmajors, "%"
      System.out.println("nonMajors");
      System.out.println(percentNonmajors);1
      
    }
 }