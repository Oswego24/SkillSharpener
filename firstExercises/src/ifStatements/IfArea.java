package ifStatements;

import java.util.Scanner;

public class IfArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle: " );
		double radius = input.nextDouble();
		
		if(radius < 0) {
			System.out.println("Invalid Radius Entered");
		}else {
			double area = radius * radius * Math.PI;
			
			System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
		}

	}

}
