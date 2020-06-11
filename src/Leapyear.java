import java.util.*;
public class Leapyear {

    public static void main(String args[])

    {
                int year;
                System.out.println("Enter the year which you want to test? ");
                Scanner sc = new Scanner(System.in);
                year = sc.nextInt();
                //To check if the year is based on the logic...
                if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                    System.out.println(year + "" +"It is a leap year");
                else
                    System.out.println("It is not a leap year");
            }        }


