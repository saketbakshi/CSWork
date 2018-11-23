import java.util.Scanner;

public class CBT007BakshiSaket 
{
    public static void main(String[] args) 
    {
        Scanner keypad = new Scanner(System.in);
        
        System.out.println("What city is the capital of France?");
        keypad.next();
        
        System.out.println("What is 6 multiplied by 7?");
        keypad.nextInt();
        
        System.out.println("What is your favorite number between 0.0 and 1.0?");
        keypad.nextDouble();
        
        System.out.println("Is there anything else you would like to tell me?");
        keypad.next();
    }
}