import java.util.Scanner;

public class MergeSortDemo
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = in.nextInt();

		int[] a = ArrayUtil.randomIntArray(n, 1000);

		StopWatch timer = new StopWatch();

		timer.start();
		MergeSorter.sort(a);
		timer.stop();
		System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");

	}
}