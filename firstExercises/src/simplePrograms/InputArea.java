package simplePrograms;

import java.util.Scanner;

public class InputArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle: " );
		double radius = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		
		System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

	}

}
