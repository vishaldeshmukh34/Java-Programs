// 12. Write a Java program to convert temperature from Fahrenheit to Celsius.

public class Q12_FahrenheitToCelsius {
    public static void main(String[] args) {
        
        double fahrenheit = 98.6; // Example value

        double celsius = (fahrenheit - 32) * 5.0 / 9;

        System.out.println("Temperature in Celsius: " + celsius);
    }
}
