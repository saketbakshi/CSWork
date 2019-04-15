/**
	Saket Bakshi. 4/7/19. Period 6. This is used for problem 1 of Chapter 13.
	Creates a rectangle class with a recursive getArea method.
*/
public class RectangleV1
{
	private int width;
	private int height;

	/**
		Creates a rectangle object.
		@param width the width of the rectangle
		@param height the height of the rectangle
	*/
	public RectangleV1(int width, int height)
	{
	    this.width = width;
	    this.height = height;
	}
	
	/**
		Calculates the area of the rectangle recursively.
		@return the area
	*/
	public int getArea()
	{
		if(this.width <= 0 || this.height <=0)
		{
			return 0;
		}
		else if(width == 1)
		{
			return height;
		}
		else
	  	{
	    	RectangleV1 smallerRectangle = new RectangleV1(width-1, height);
	    	int smallerArea = smallerRectangle.getArea();
	    	return smallerArea + height;
		}
	}
}