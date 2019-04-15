/**
	Saket Bakshi. 4/7/19. Period 6. This is used for problem 2 of Chapter 13.
	Tests a square class with a recursive getArea method.
*/
public class SquareV1Tester
{
	public static void main(String[] args)
	{
		final int WIDTH = 20; //width of the first square
		
		SquareV1 square1 = new SquareV1(WIDTH); //creating objects
		SquareV1 square2 = new SquareV1(WIDTH-1);
		System.out.println("Area, first square: " + square1.getArea()); //experimental calculations
		System.out.println("Expected: 400"); //expected
		System.out.println("Area, second square: " + square2.getArea());
		System.out.println("Expected: 361");
	}
}