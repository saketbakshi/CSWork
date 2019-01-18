public class CBT111Driver
{
	public static void main(String[] args) {
		CBT111BakshiSaket j = new CBT111BakshiSaket("Robert", "Parker", "Butch");
		System.out.println(j.getFullName());

		j.setLast("Elliott");
		j.setFirst("Samuel");
		j.setNick("Sam");
		System.out.println(j.getFullName());

		j.first = "Avery";
		//j.last = "Markham";
		System.out.println(j.nick);
	}
}