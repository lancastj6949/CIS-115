// John Lancaster
// M4HW2
// 3/21/2026
// This program determines if someone can vote in NC
import java.util.Scanner;
public class M4HW2_Lancaster 
{
    
    public static void main(String[] args) 
    {
        // Declare US citizen
        // Declare County registration time
        // Declare age
        // Declare not serving felonly sentence/probation
        Double us_citizen, County_registration_time, age, serving_felonly_sentence_probation;
        Scanner k = new Scanner(System.in);

        System.out.println("Enter are you a us citizen, 0 is yes, 1 is no: ");
        us_citizen = k.nextDouble();

        if(us_citizen >= 1)
          System.out.println("ability to vote denied, must be a us citizen: ");
          

        if(us_citizen < 1)
        System.out.println("Enter County registration time: ");
        County_registration_time = k.nextDouble();
        if(County_registration_time < 30)
            System.out.println("ability to vote denied, must be at least 30: ");

        
        if(County_registration_time >= 30)
        System.out.println("Enter age: ");
        age = k.nextDouble();
        if(age < 18)
            System.out.println("ability to vote denied, must be at least 18: ");

        if(age >= 18)
        System.out.println("Enter are you serving felonly sentence/probation, < 1 is yes, > 2 is no: ");
        serving_felonly_sentence_probation = k.nextDouble();
        if(serving_felonly_sentence_probation < 1)
            System.out.println("ability to vote denied, cannot have a record: ");


        if(serving_felonly_sentence_probation > 2)
        System.out.println("ability to vote has been granted");
            
        
        
        
        
            
            
            
            

            
        
    }
}
