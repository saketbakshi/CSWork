public class VendingMachineTester
{
	public static void main(String[] args)
	{
		VendingMachine machine = new VendingMachine();
		machine.addCans(10); // Fill up with ten cans
		machine.buySoda();
		machine.buySoda();
		System.out.print("Token count: ");
		System.out.println(machine.getTokens());
		System.out.println("Expected: 2");
		System.out.print("Can count: ");
		System.out.println(machine.getCans());
		System.out.println("Expected: 8");
	}
}