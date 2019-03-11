/** Saket Bakshi. 3/4/19. Period 6. This is used for question 1 of Chapter 10.
	Adds a method to the Data class that returns the object with the greatest measure.
*/
public class Data
{
	/**
		Computes the average of the measures of the given objects.
		@param objects an array of Measurable objects
		@return the average of the measures
	*/
	public static double average(Measurable[] objects)
	{
		double sum = 0;
		for(Measurable obj : objects)
		{
			sum = sum + obj.getMeasure();
		}
		if(objects.length > 0) {return sum / objects.length;}
		else {return 0;}
	}

	/**
		Finds the maximum an object has out of an array of given objects.
		@param objects an array of Measurable objects
		@return the object with the maximum
	*/
	public static Measurable max(Measurable[] objects)
	{
		double max = 0;
		Measurable maximum = null;
		for(Measurable obj : objects)
		{
			if(obj.getMeasure() > max)
			{
				max = obj.getMeasure();
				maximum = obj;
			}
		}

		return maximum;
	}
}