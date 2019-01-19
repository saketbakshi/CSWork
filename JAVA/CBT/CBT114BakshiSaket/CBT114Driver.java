public class CBT114Driver
{
	public static void main(String[] args) {
		CBT114BakshiSaket t = new CBT114BakshiSaket("Thu Feb 19 20:29:00 +0000 2105", 8, true, 568507566168223744L, 2, false, "You can now buy 'Learn Java the Hard Way' using bitcoin! Probably!"+"\nThanks, @stripe ! #ljthw");

		System.out.println(t.toString());
		System.out.println("\n------------------------\n");
		System.out.println(t);
	}
}