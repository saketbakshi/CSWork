import java.util.Scanner;

public class CBT008BakshiSaket
{
    public static void main(String[] args) 
    {
        String name;
        int age;
        double weight, income;
        
        Scanner keypad = new Scanner(System.in);
        
        System.out.print("Hello. What is your name? ");
        name = keypad.next();
        
        System.out.print("Hi, " + name + "! How old are you? ");
        age = keypad.nextInt();
        
        System.out.println("So you're " + age + ", eh? That's not old at all. ");
        System.out.print("How much do you weigh, " + name + "? ");
        weight = keypad.nextDouble();
        
        System.out.print(weight + "! Better keep that quiet. Finally, what's your income, " + name + "? ");
        income = keypad.nextDouble();
        
        System.out.println("Hopefully that is " + income + " per hour and not per year!");
        System.out.println("Well, thanks for answering my rude questions, " + name + ".");
    }
}