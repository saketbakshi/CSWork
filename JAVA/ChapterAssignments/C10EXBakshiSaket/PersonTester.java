/** Saket Bakshi. 3/4/19. Period 6. This is used for question 3 of Chapter 10.
	Tests a Person class that implements the interface Measurable so we can test interfaces.
*/
public class PersonTester
{
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person(180, "Saket");
		people[1] = new Person(140, "Billy");
		people[2] = new Person(190, "Jack");

		double averageHeight = Data.average(people);
		System.out.println("Average score: " + averageHeight);
		System.out.println("Expected average: 170");

		Person tallest = (Person)Data.max(people);

		int maxHeight = (int)tallest.getMeasure();
		String nombre = tallest.getName();

		System.out.println("The maximum height was " + maxHeight + ". This height was on " + nombre + ".");
	}
}