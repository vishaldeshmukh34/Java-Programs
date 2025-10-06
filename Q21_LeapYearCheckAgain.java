// 21. Write a program to accept a year and check whether it is a Leap Year or not.
public class Q21_LeapYearCheckAgain {
    public static void main(String[] args) {
        int year = 2000 ;

        if(year % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else if (year % 100 == 0)
        {
            System.out.println("Not Leap Year");
        }
        else if ( year % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("NOT Leap Year");
        }
    }
}
