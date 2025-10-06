// 29. Write a Java program to convert kilometers into meters, centimeters, and millimeters.
public class Q29_KilometerConversion {
    public static void main(String[] args) {
        
     double km = 5 ;

    double meters = km * 1000 ;
     double centimeters = km * 100000 ;
     double millimeters = km * 1000000;

    System.out.println("Meters: " + meters);
System.out.println("Centimeters: " + centimeters);
System.out.println("Millimeters: " + millimeters);


    }
}
