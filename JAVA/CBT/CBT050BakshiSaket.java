import java.util.Scanner;

public class CBT050BakshiSaket
{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason", "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"};
		String guess;
		boolean found;

		System.out.print("Pop Quiz! Name any mortal hero from Greek mythology: ");
		guess = key.next();

		found = false;
		for(String hero: heroes)
		{
			if(guess.equals(hero))
			{
				System.out.println("That's correct!");
				found = true;
			}

		}

		if(found == false)
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
	}
}