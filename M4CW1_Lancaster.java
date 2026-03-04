import java.util.Set;

public class M4CW1_Lancaster {
    public static void main(String[]args){
        // Variables
        Declare Integer majors         // Number of CS majors
        Declare Integer nonmajors      // Number of nonmajors
        Declare Real total             // Total number of students
        Declare Real percentMajors     // Percentage of CS majors
        Declare Real percentNonmajors  // Percentage of nonmajors

        // Get the number of majors.
        Display "Enter the number of students majoring in cs:"
        Input majors

        // Get the number of nonmajors.
        Display "Enter the number of non-computer science students:"
        Input nonmajors

        // Calculate the total number of students.
        Set total = majors + nonmajors
        
        //Calculate the percentage of majors.
        Set percentMajors = majors / total * 100

        // Calculate the percentage of nonmajors.
        Set percentNonmajors = nonmajors / total * 100

        // Display the percentage of majors.
        Display "Majors: ", percentMajors, "%"

        // Display the percentage of nonmajors.
        Display "Nonmajors: ", percentNonmajors, "%"
    }
}