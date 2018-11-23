/*
Saket Bakshi
10/11/18
Project 3.3
This tests a balloon class for inflating a balloon.
*/
public class BalloonTester
{
	public static void main(String[] args)
	{
		Balloon red = new Balloon(); //creates a new balloon
		red.inflate(4); //inflates the balloon by radius of 4;
		System.out.println(red.getVolume()); //returns volume of balloon
		System.out.println("Expected volume: 268.083");
	}
}