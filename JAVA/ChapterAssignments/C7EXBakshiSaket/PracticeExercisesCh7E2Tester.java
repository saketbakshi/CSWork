/* Saket Bakshi 12/10/18. Period 6
This program, for #2 of Ch 7, tests a class that completes tasks for an array of integers
*/
import java.util.Random;

public class PracticeExercisesCh7E2Tester
{
	public static void main(String[] args)
	{
		System.out.println("Part A:");
		int[] arrayA = { 0, 1, 2, 3, 4, 5 };
		PracticeExercisesCh7E2 a = new PracticeExercisesCh7E2(arrayA);
		a.getOriginal();
		System.out.println("");
		a.partA();
		a.getModded();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part B:");
		int[] arrayB = {1, 4, 9, 16, 25, 36};
		PracticeExercisesCh7E2 b = new PracticeExercisesCh7E2(arrayB);
		b.getOriginal();
		System.out.println("");
		b.partB();
		b.getModded();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part C:");
		int[] arrayC = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 c = new PracticeExercisesCh7E2(arrayC);
		c.getOriginal();
		System.out.println("");
		c.partC();
		c.getModded();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part D:");
		Random r = new Random();
		int[] arrayD = new int[10];
		for(int i = 0; i < 10; i++)
		{
			arrayD[i] = r.nextInt();
		}
		PracticeExercisesCh7E2 d = new PracticeExercisesCh7E2(arrayD);
		d.getOriginal();
		System.out.println("");
		d.partD();
		d.getModded();
		System.out.println("");
		System.out.println("");

		System.out.println("Part E:");
		int even = 1;
		do
		{
			even = r.nextInt(10);
		} while(even % 2 != 0);
		int[] arrayE = new int[even];
		for(int i = 0; i < arrayE.length ; i++)
		{
			arrayE[i] = r.nextInt();
		}
		PracticeExercisesCh7E2 e = new PracticeExercisesCh7E2(arrayE);
		e.getOriginal();
		System.out.println("");
		e.partE();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part E, sample 2:");
		int odd = 0;
		do
		{
			odd = r.nextInt(10);
		} while(odd % 2 != 1);
		int[] arrayE2 = new int[odd];
		for(int i = 0; i < arrayE2.length; i++)
		{
			arrayE2[i] = r.nextInt();
		}
		PracticeExercisesCh7E2 e2 = new PracticeExercisesCh7E2(arrayE2);
		e2.getOriginal();
		System.out.println("");
		e2.partE();
		System.out.println("");
		System.out.println("");

		System.out.println("Part F:");
		int[] arrayF = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 f = new PracticeExercisesCh7E2(arrayF);
		f.getOriginal();
		System.out.println("");
		f.partF();
		f.getModded();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part G:");
		int[] arrayG = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 g = new PracticeExercisesCh7E2(arrayG);
		g.getOriginal();
		System.out.println("");
		g.partG();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part H (should return true):");
		int[] arrayH = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 h = new PracticeExercisesCh7E2(arrayH);
		h.getOriginal();
		System.out.println("");
		h.partH();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part H, sample 2 (should return false):");
		int[] arrayH2 = {0, 1, 6, 3, 4, 5};
		PracticeExercisesCh7E2 h2 = new PracticeExercisesCh7E2(arrayH2);
		h2.getOriginal();
		System.out.println("");
		h2.partH();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part I (should return false):");
		int[] arrayI = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 i = new PracticeExercisesCh7E2(arrayI);
		i.getOriginal();
		System.out.println("");
		i.partI();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part I, sample 2 (should return true):");
		int[] arrayI2 = {0, 1, 1, 3, 4, 5};
		PracticeExercisesCh7E2 i2 = new PracticeExercisesCh7E2(arrayI2);
		i2.getOriginal();
		System.out.println("");
		i2.partI();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part J (should return false):");
		int[] arrayJ = {0, 1, 2, 3, 4, 5};
		PracticeExercisesCh7E2 j = new PracticeExercisesCh7E2(arrayJ);
		j.getOriginal();
		System.out.println("");
		j.partJ();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part J, sample 2 (should return true):");
		int[] arrayJ2 = {0, 1, 1, 3, 4, 5};
		PracticeExercisesCh7E2 j2 = new PracticeExercisesCh7E2(arrayJ2);
		j2.getOriginal();
		System.out.println("");
		j2.partJ();
	}
}