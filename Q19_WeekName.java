// 19. Write a program to accept a number (1–7) and display the corresponding day of the week.

public class Q19_WeekName {
    public static void main(String[] args) {
        
        int day = 3; // you can change this value or take input later

        if (day == 1) {
            System.out.println("Sunday");
        } 
        else if (day == 2) {
            System.out.println("Monday");
        } 
        else if (day == 3) {
            System.out.println("Tuesday");
        } 
        else if (day == 4) {
            System.out.println("Wednesday");
        } 
        else if (day == 5) {
            System.out.println("Thursday");
        } 
        else if (day == 6) {
            System.out.println("Friday");
        } 
        else if (day == 7) {
            System.out.println("Saturday");
        } 
        else {
            System.out.println("Invalid day number! Please enter between 1 and 7.");
        }
    }
}
