// 18. Write a program to accept a year and check whether it is Leap Year or not.

public class Q18_LeapYearCheck {
    public static void main(String[] args) {

        int year = 2023;  // you can change this value or take input later

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year.");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
