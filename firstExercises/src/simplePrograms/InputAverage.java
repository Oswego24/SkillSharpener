package simplePrograms;

import java.util.Scanner;

public class InputAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three numbers: ");
		
		double numberOne = input.nextDouble();
		double numberTwo = input.nextDouble();
		double numberThree = input.nextDouble();

		double avg = (numberOne + numberTwo + numberThree) / 3;
		
		System.out.println("The average of the three numbers entered is: " + avg);
	}

}
