/* Saket Bakshi 1/30/19. Period 6
This program, for #5 of Ch 8, calculates surface areas and volumes for certain 3D objects.
*/
public class PracticeExercisesCh8E5
{
	/** Calculates cube volume
	@param h the height of the cube
	@return the volume of the cube
	*/
	public static double cubeVolume(double h)
	{
		return h*h*h;
	}

	/** Calculates cube surface area
	@param h the height of the cube
	@return the surface area of the cube
	*/
	public static double cubeSurface(double h)
	{
		return 6*h*h;
	}

	/** Calculates sphere volume
	@param r the radius of the sphere
	@return the volume of the sphere
	*/
	public static double sphereVolume(double r)
	{
		return 4/3*Math.PI*r*r*r;
	}

	/** Calculates sphere surface area
	@param r the radius of the sphere
	@return the surface area of the sphere
	*/
	public static double sphereSurface(double r)
	{
		return 4*Math.PI*r*r;
	}

	/** Calculates cylinder volume
	@param h the height of the cylinder
	@param r the radius of the cylinder
	@return the volume of the cylinder
	*/
	public static double cylinderVolume(double r, double h)
	{
		return Math.PI*r*r*h;
	}

	/** Calculates cylinder surface area
	@param h the height of the cylinder
	@param r the radius of the cylinder
	@return the surface area of the cylinder
	*/
	public static double cylinderSurface(double r, double h)
	{
		return (2*Math.PI*r*r) + (2*Math.PI*r*h);
	}

	/** Calculates cone volume
	@param h the height of the cone
	@param r the radius of the cone
	@return the volume of the cone
	*/
	public static double coneVolume(double r, double h)
	{
		return Math.PI*r*r*h/3;
	}

	/** Calculates cone surface area
	@param h the height of the cone
	@param r the radius of the cone
	@return the surface area of the cone
	*/
	public static double coneSurface(double r, double h)
	{
		return Math.PI*r*(r+Math.sqrt(h*h + r*r));
	}
}