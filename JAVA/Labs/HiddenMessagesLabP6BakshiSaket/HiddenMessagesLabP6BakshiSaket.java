/* Saket Bakshi. Mr. Caces. AP Computer Science A. Due 27 January 2019.
This class takes messages and decodes them through a cover sheet, as done in the 90s action thriller, Con Air.
*/
public class HiddenMessagesLabP6BakshiSaket
{
  //instance variables

  private String[] originalMessage; //to hold the original message
  private String decodedMessage; //to hold the decoded message

  private int numberOfLinesInCover; //number of lines in the cover sheet
  private String[] coverLines; //content of each line in the cover sheet
  private int rowNum; //number of rows
  private int colNum; //number of columns

  /** This class takes messages and decodes them through a cover sheet, as done in the 90s action thriller, Con Air
  @param message the original message
  @param numberOfLinesInCover the number of lines in the cover sheet
  @param coverContent an array of the cover, where each element contains a line of the array, in order
  @param rowNum number of rows
  @param colNum number of columns
  */
  public HiddenMessagesLabP6BakshiSaket(String[] message, int numberOfLinesInCover, String[] coverContent, int rowNum, int colNum)
  {
    this.originalMessage = message;
    this.decodedMessage = "";
    
    this.numberOfLinesInCover = numberOfLinesInCover;
    this.coverLines = coverContent;
    this.rowNum = rowNum;
    this.colNum = colNum;
  }

  /** decodes the message
  */
  public void decode()
  {
    for(int i = 0; i < this.numberOfLinesInCover; i++) //goes through each line in cover
    {
      for(int k = 0; k < this.coverLines[i].length(); k++) //goes through each character in each line
      {
        String openOrNot = this.coverLines[i].substring(k, k+1);
        if(openOrNot.equals("O")) //checks if the character is "open"
        {
          this.decodedMessage = this.decodedMessage + this.originalMessage[this.rowNum+i].charAt(k+this.colNum); //if open, the character at the same spot in the message is added to the decoded message
        }
      }
    }
  }

  /** returns the decoded message
  @return the decoded message
  */
  public String getDecodedMessage()
  {
    return this.decodedMessage;
  }
}