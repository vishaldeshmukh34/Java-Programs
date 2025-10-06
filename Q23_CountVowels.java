// 23. Write a Java program to count the number of vowels in a string.

public class Q23_CountVowels {
    public static void main(String[] args) {
        
        String str = "vishal";
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // get each character

            // Check if it's a vowel (both lowercase & uppercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("Number of vowels in the string: " + count);
    }
}
