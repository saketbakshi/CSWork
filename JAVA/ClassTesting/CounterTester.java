//September 24 2018
public class CounterTester
{
	public static void main(String[] args)
	{
		Counter bob = new Counter(130);

		System.out.println(bob.getValue());

		Counter allen = new Counter();

		allen.click();
		allen.click();

		System.out.println(allen.getValue());

		allen.unclick();

		System.out.println(allen.getValue());

		allen.reset();

		System.out.println(allen.getValue());
	}
}