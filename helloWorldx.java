import java.util.Scanner;

public class helloWorldx
{
    public static void main (String[] args)
    {
        System.out.println("Hello, what's your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Hello " + name);
    }
}