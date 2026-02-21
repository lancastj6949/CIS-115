// CircleDemo.java
// A simple program to calculate area, circumference, and diameter of a circle


 public class M3HW1_Lancaster {
   public static void main(String[]args) {
    // Declare and assign a radius
    double radius = 5.0; // you can change this value to test with differnet radii
    // Perform calculations
    double diameter = 2 * radius;
    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;
    // Display results
    System.out.println("Circle with radius: " + radius);
    System.out.println("Diameter: " + diameter);
    System.out.println("Circumference: " + circumference);
    System.out.println("Area: " + area);
    
   }
}

