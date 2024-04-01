import java.util.Scanner;
public class AreaCalculator {
public double calculateRectangleArea(double length, double width) {
return length * width;
}
public double calculateCircleArea(double radius) {
return Math.PI * radius * radius;
}
public double calculateSquareArea(double side) {
return side * side;
}
public static void main(String[] args) {
AreaCalculator calculator = new AreaCalculator();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the shape for which you want to calculate area (rectangle, circle, square): ");
String shape = scanner.nextLine();
double area = 0.0;

switch (shape.toLowerCase()) {
case "rectangle":
System.out.println("Enter the length and width of the rectangle: ");
double length = scanner.nextDouble();
 double width = scanner.nextDouble();
area = calculator.calculateRectangleArea(length, width);
break;
case "circle":
System.out.println("Enter the radius: ");
  double radius = scanner.nextDouble();
 area = calculator.calculateCircleArea(radius);
break;
default:
 System.out.println("Invalid shape");
return;
   }
System.out.printf("Area of %s: %.2f%n", shape, area);
    }
}
