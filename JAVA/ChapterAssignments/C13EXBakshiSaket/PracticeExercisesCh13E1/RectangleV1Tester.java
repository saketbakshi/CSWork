/**
	Saket Bakshi. 4/7/19. Period 6. This is used for problem 1 of Chapter 13.
	Tests a rectangle class with a recursive getArea method.
*/
public class RectangleV1Tester
{
	public static void main(String[] args)
	{
		final int WIDTH = 20; //height and widths of rectangles
		final int HEIGHT= 8;
		
		RectangleV1 rectangle1 = new RectangleV1(WIDTH, HEIGHT); //creating objects
		RectangleV1 rectangle2 = new RectangleV1(WIDTH-1, HEIGHT);
		System.out.println("Area, first rectangle: " + rectangle1.getArea()); //experimental calculations
		System.out.println("Expected: 160"); //expected
		System.out.println("Area of second rectangle: " + rectangle2.getArea());
		System.out.println("Expected: 152");
	}
}