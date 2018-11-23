/*
Saket Bakshi
10/11/18
Project 3.3
This creates a balloon class for inflating a balloon.
*/
public class Balloon
{
	//instance variables
	private double radius;
	private double volume;

	/** This creates a Balloon class object with a radius. This object has methods
	to get the volume of the spherical balloon and inflate its radius. Each 
	balloon starts with radius 0.
	*/
	public Balloon()
	{
		this.radius = 0;
		this.volume = 0;
	}

	/**This inflates the balloon
	@param amount the amount by which the balloon's radius is inflated
	*/
	public void inflate(double amount)
	{
		this.radius = this.radius + amount;
		this.volume = Math.PI * 4 /3 * Math.pow(this.radius, 3);
	}

	/**This returns the balloon's volume.
	@return the balloon's volume
	*/
	public double getVolume()
	{
		return this.volume;
	}
}