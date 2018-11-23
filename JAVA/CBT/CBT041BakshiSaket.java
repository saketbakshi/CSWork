import java.io.FileWriter;
import java.io.PrintWriter;

public class CBT041BakshiSaket
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		fileout = new PrintWriter( new FileWriter("letterCBT041BakshiSaket.txt") );
		fileout.println( "+---------------------------------------------------------+" );
		fileout.println( "|                                                    #### |" );
		fileout.println( "|                                                    #### |" );
		fileout.println( "|                                                    #### |" );
		fileout.println( "|                                                         |" );
		fileout.println( "|                                                         |" );
		fileout.println( "|                              Bill Gates                 |" );
		fileout.println( "|                              1 Microsoft Way            |" );
		fileout.println( "|                              Redmond, WA 98104          |" );
		fileout.println( "|                                                         |" );
		fileout.println( "+---------------------------------------------------------+" );
		fileout.close();
	}
}

