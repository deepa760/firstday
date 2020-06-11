import java.util.Scanner;

public class average {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

    public static int average(int x, int y, int z)
    {
        return (x + y + z) / 3;
    }
}
