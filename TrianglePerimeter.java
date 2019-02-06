import java.util.*;
public class TrianglePerimeter{	
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("First side of triangle: ");
double first = input.nextDouble();
System.out.println("Second side of triangle: ");
double second = input.nextDouble();
System.out.println("Third side of triangle: ");
double third = input.nextDouble();


if ((first + second) > third & (third + first)  > second & (third + second) > first) {
	double perimeter = first + second + third;
	System.out.println("The perimeter of triangle is: " + perimeter);
}else {
	System.out.println("Invalid");
}
input.close();
	}
}
