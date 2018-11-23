/* Saket Bakshi
Mr. Caces
AP Computer Science
28 September 2018			Circle Lab
*/
public class CircleP6BakshiSaket
{
	//declaring instance variables
	private double x_coordinate; //variable for x-coordinate
	private double y_coordinate; //variable for y-coordinate
	private double radius; //variable for radius
	private double circumference; //variable for circumference
	private double diameter; //variable for diameter
	private double area; //variable for area
	private double radiusSquared; //variable for squaring radius

	public CircleP6BakshiSaket() //Default constructor for an empty Circle class variable
	{
		this.x_coordinate = 0;
		this.y_coordinate = 0;
		this.radius = 0;
	}

	/** Defines a Circle class variable with an x-coordinate for the center, y-coordinate for the center, and radius. Has methods for 
		getting the x-coordinates, getting the y-coordinates, getting the area, getting the circumference, getting the diameter, and 
		growing the circle radius.
		@param x_center x-coordinate for circle's center
		@param y_center y-coordinate for circle's center
		@param circleRadius radius for initialized circle
	*/
	public CircleP6BakshiSaket(double x_center, double y_center, double circleRadius) //three double type variable constructor
	{
		this.x_coordinate = x_center;
		this.y_coordinate = y_center;
		this.radius = circleRadius;
		this.diameter = circleRadius*2; //multiplying radius by two and assigning that value to diameter
		this.circumference = 2*Math.PI*circleRadius; //assigning formula for circumference to circumference
		this.radiusSquared = Math.pow(circleRadius, 2); //squaring the radius for use in the circle area formula
		this.area = Math.PI*radiusSquared; //multiplying radius squared with pi to calculate area
	}

	/** Returns the x-coordinate, accessor method
		@return the x-coordinate
	*/
	public double getX_Coordinates()
	{
		return x_coordinate;
	}

	/** Returns the y-coordinate, accessor method
		@return the y-coordinate
	*/
	public double getY_Coordinates()
	{
		return y_coordinate;
	}

	/** Returns the radius, accessor method
		@return the radius
	*/
	public double getRadius()
	{
		return radius;
	}

	/** Returns the diameter, accessor method
		@return the diameter
	*/
	public double getDiameter()
	{
		return diameter;
	}

	/** Returns the circumference, accessor method
		@return the circumference
	*/
	public double getCircumference()
	{
		return circumference;
	}

	/** Returns the area, accessor method
		@return the area
	*/
	public double getArea()
	{
		return area;
	}

	/** Takes positive value for growing the circle radius and recalculates diameter, circumference, and area
		@param radiusGrowth factor by which radius grows
	*/
	public void growCircle(double radiusGrowth)
	{
		this.radius = radius * radiusGrowth;
		this.diameter = radius*2;
		this.circumference = 2*Math.PI*radius;
		this.radiusSquared = Math.pow(radius, 2);
		this.area = Math.PI*radiusSquared;

	}

}