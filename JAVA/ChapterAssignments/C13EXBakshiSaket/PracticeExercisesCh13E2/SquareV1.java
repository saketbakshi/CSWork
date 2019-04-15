/**
	Saket Bakshi. 4/7/19. Period 6. This is used for problem 2 of Chapter 13.
	Creates a square class with a recursive getArea method.
*/
public class SquareV1
{
	private int width;

	/**
		Creates a square object.
		@param width the width of the square
	*/
	public SquareV1(int width)
	{
    	this.width = width;
  	}

  	/**
		Calculates the area of the square recursively.
		@return the area
	*/
  	public int getArea()
  	{
    	if(width <= 0)
    	{
    		return 0;
    	}
    	else if(width == 1)
    	{
    		return 1;
    	}
    	else
    	{
	      	SquareV1 smallerSquare = new SquareV1(width-1);
	      	int smallerArea = smallerSquare.getArea();
	      	return smallerArea + width + width-1;
    	}
  	}
}