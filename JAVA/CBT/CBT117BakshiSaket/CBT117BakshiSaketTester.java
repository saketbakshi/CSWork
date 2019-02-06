public class CBT117BakshiSaketTester
{
	public static void main(String[] args) {
		String book = "http://www.gutenberg.org/cache/epub/159/pg159.txt";

		CBT117BakshiSaket wc = new CBT117BakshiSaket(book);

		System.out.println(wc.getCount("the"));
		System.out.println(wc.getCount("I"));
		System.out.println(wc.getCount("a"));
	}
}