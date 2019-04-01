import java.util.Scanner;
/**
	Saket Bakshi. 3/28/19. Period 6. This is used for project 1 of Chapter 12.
	Tests the vending machine project.
*/
public class VendingMachineTester
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		VendingMachine theVendingMachine = new VendingMachine();
		
		theVendingMachine.add(new Product("Potato chips", 0.99));
		theVendingMachine.add(new Product("Potato chips", 0.99));
		theVendingMachine.add(new Product("Potato chips", 0.99));
		theVendingMachine.add(new Product("Potato chips", 0.99));
		
		theVendingMachine.add(new Product("Soda", 1.99));
		theVendingMachine.add(new Product("Soda", 1.99));
		
		theVendingMachine.add(new Product("Candy", 2.99));
		theVendingMachine.add(new Product("Candy", 2.99));
		
		Cashier vendor = new Cashier(theVendingMachine);
		
		String productWanted = "";
		do
		{
		System.out.println("This is inside the machine: ");
		theVendingMachine.whatsInside();
		System.out.println();
		
		double value = 0;
		while(value != -1)
		{
			System.out.println("Insert a coin (quarter, dime, nickel, penny)\n(Type -1 to stop)");
			value = keyboard.nextDouble();
			if(value != -1)
				vendor.addCoin(value);
		}
		keyboard.nextLine();
		System.out.println();
		
		System.out.println("What would you like to buy?\n(Type nothing to stop)");
		productWanted = keyboard.nextLine();
		System.out.println();
		
		if(!productWanted.equals("nothing"))
			System.out.println(vendor.attemptTransaction(productWanted));

		System.out.println();
		} while(!productWanted.equals("nothing"));
		System.out.println("Thanks for shopping!");
		
		keyboard.close();
	}
}