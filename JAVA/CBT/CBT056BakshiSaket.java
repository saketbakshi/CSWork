import java.util.Scanner;

class TemperatureSample{
	int month, day, year;
	double temperature;
}

public class CBT056BakshiSaket
{
	public static void main(String[] args) throws Exception {
		String url = "http://learnjavathehardway.org/txt/avg-daily-temps-with-dates-atx.txt";
		Scanner key = new Scanner((new java.net.URL(url)).openStream());

		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0;

		while(key.hasNextInt() && i < tempDB.length)
		{
			TemperatureSample e = new TemperatureSample();
			e.month = key.nextInt();
			e.day = key.nextInt();
			e.year = key.nextInt();
			e.temperature = key.nextDouble();
			if(e.temperature == -99)
				continue;
			tempDB[i] = e;
			i++;
		}
		key.close();
		numRecords = i;

		System.out.println(numRecords + " daily temperatures loaded.");

		double total = 0, avg;
		int count = 0;
		for(i = 0; i < numRecords; i++)
		{
			if(tempDB[i].month == 11)
			{
				total += tempDB[i].temperature;
				count++;
			}
		}

		avg = total / count;
		avg = roundToOneDecimal(avg);
		System.out.println("Average daily temperature over " + count + " days in November: " + avg);
	}

	public static double roundToOneDecimal(double d)
	{
		return Math.round(d*10)/10.0;
	}
}