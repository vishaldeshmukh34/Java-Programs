// 22. Write a program to accept a day of the week (int) and display the weekday (using switch case).
public class Q22_DayOfWeekSwitch {
    public static void main(String[] args) {
        int  day = 2 ;

       switch (day) 
       {
        case 1: System.out.println("Sunday"); break;
        case 2: System.out.println("Monday"); break;
        case 3: System.out.println("Tuesday"); break;
        case 4: System.out.println("Wednesday"); break;
        case 5: System.out.println("Thursday"); break;
        case 6: System.out.println("Friday"); break;
        case 7: System.out.println("Saturday"); break;
      default:System.out.println("Invalid day number! Please enter between 1 and 7.");
            
       }
    }
}
