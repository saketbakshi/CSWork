public class CBT113Driver
{
	public static void main(String[] args) {
		CBT113BakshiSaket a = new CBT113BakshiSaket();

		CBT113BakshiSaket pal = new CBT113BakshiSaket("Lassie", "Rough Collie", 3, 26);
		CBT113BakshiSaket spike = new CBT113BakshiSaket("Yeller", "Mastador", 5, 43);

		System.out.println(pal.getName() + " is a " + pal.getBreed() + ".");
		System.out.println(spike.getName() + " is a " + spike.getBreed() + ".");

		System.out.println(pal.getEverything());
		System.out.println(a.getEverything());
	}
}