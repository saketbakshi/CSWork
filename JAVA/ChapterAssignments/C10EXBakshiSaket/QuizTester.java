/** Saket Bakshi. 3/4/19. Period 6. This is used for question 2 of Chapter 10.
	Tests a Quiz class that implements the interface Measurable so we can test interfaces.
*/
public class QuizTester
{
	public static void main(String[] args) {
		Quiz[] scores = new Quiz[3];
		scores[0] = new Quiz(100, "A+");
		scores[1] = new Quiz(40, "F");
		scores[2] = new Quiz(70, "C-");

		double averageScore = Data.average(scores);
		System.out.println("Average score: " + averageScore);
		System.out.println("Expected average: 70");

		Quiz bestScore = (Quiz)Data.max(scores);

		int maxScore = (int)bestScore.getMeasure();
		String maxGrade = bestScore.getGrade();

		System.out.println("The maximum score was " + maxScore + ". This score received a grade of " + maxGrade + ".");
	}
}