/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 27 January 2019.
This class takes inputs for the class, HiddenMessagesLabP6BakshiSaket, and prints out decoded messages.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("input.txt"); //brings input into console
    Scanner scanned = new Scanner(file); //creates Scanner object out of input file

    int numberOfCases = scanned.nextInt(); //takes number of cases
    for(int m = 0; m < numberOfCases; m++) //makes loop for number of cases
    {
      int numLinesMessage = scanned.nextInt(); //takes number of lines in original message
      
      scanned.nextLine(); //goes to next line that starts the original message

      String[] originalMessage = new String[numLinesMessage]; //makes array to contain each line of original message
      for(int i = 0; i < numLinesMessage; i++) //fills in array from previous line
      {
        originalMessage[i] = scanned.nextLine();
      }

      String startCoordinate = scanned.next(); //takes in start coordinate of cover
        String rowNumberString = startCoordinate.substring(0, startCoordinate.indexOf(","));
          int rowNumber = Integer.parseInt(rowNumberString); //converts to integer for row
        String columnNumberString = startCoordinate.substring(startCoordinate.indexOf(",") + 1);
          int columnNumber = Integer.parseInt(columnNumberString); //converts to integer for column

      int numberOfLinesInCover = scanned.nextInt(); //takes number of lines in cover
      
      scanned.nextLine(); //goes to next line which starts the cover

      String[] coverContent = new String[numberOfLinesInCover]; //makes an array to hold each line of the cover
      for(int i = 0; i < numberOfLinesInCover; i++) //fills in array from previous line
      {
        coverContent[i] = scanned.nextLine();
      }

      HiddenMessagesLabP6BakshiSaket tester = new HiddenMessagesLabP6BakshiSaket(originalMessage, numberOfLinesInCover, coverContent, rowNumber, columnNumber); //creates HiddenMessages object
      tester.decode(); //decodes the message

      System.out.println(tester.getDecodedMessage()); //returns the message for each line in the cover
    }
  }
}