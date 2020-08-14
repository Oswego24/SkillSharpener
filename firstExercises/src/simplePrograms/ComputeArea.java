package simplePrograms;

public class ComputeArea {

	public static void main(String[] args) {
		double area;
		double radius;
		
		radius = 20;
		
		area = radius * radius * Math.PI; 
		
		System.out.println("The area of the circle with radius " + radius + " is: " + area);
		
		double i = 50.0;
		double k = i + 50.0;
		double j = k + 1;
		
		System.out.println("j is " + j + " and k is " + k);
	}

}
