// 30. Write a Java program to convert days into years, weeks, and days.
public class Q30_DaysConversion {
    public static void main(String[] args) {
        
       

       int totalDays = 1000 ;

       int years = totalDays / 365;


       int remainingDays = totalDays % 365;


       int weeks = remainingDays / 7;


       int days = remainingDays % 7 ;


       System.out.println("Total Day :- " + totalDays);

       System.out.println("Years :- " +years);

       System.out.println("Weeks :- " +weeks);

       System.out.println("Days :-" +days);
       



    }
}
