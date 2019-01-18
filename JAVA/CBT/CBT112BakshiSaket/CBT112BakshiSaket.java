public class CBT112BakshiSaket
{
	private int length, width;

	public CBT112BakshiSaket()
	{
		length = width = 0;
	}

	public CBT112BakshiSaket(int l, int w)
	{
		length = l;
		width = w;
	}

	public int getArea()
	{
		return length*width;
	}
}