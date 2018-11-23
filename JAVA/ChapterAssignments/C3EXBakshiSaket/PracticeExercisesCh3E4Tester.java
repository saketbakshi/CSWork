/*
Saket Bakshi
Period 6
10/11/18
This program tests a class, normally named "student", for a student with a name their quizzes.
*/
public class PracticeExercisesCh3E4Tester
{
	public static void main(String[] args)
	{
		PracticeExercisesCh3E4 saket = new PracticeExercisesCh3E4("Saket", 100); //makes new student class object

		System.out.println(saket.getName()); //returns object's name
		System.out.println("expected output: Saket");

		saket.addQuiz(90); //adds a quiz score of 90

		System.out.println(saket.getTotalScore()); //returns total points student has
		System.out.println("Expected output: 190");

		System.out.println(saket.getAverageScore()); //returns average quiz score
		System.out.println("Expected output: 95");	
	}
}