// 6. Write a program to accept marks of 5 subjects, calculate total, average, and display percentage.

public class Q6_TotalAveragePercentage {
    public static void main(String[] args) {
        
        int subject1 = 60;
        int subject2 = 45;
        int subject3 = 63;
        int subject4 = 65;
        int subject5 = 23;

        int total = subject1 + subject2 + subject3 + subject4 + subject5;

        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Percentage = " + percentage + "%");
    }
}
