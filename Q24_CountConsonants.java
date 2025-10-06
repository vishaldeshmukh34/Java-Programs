// 24. Write a Java program to count the number of consonants in a string.

public class Q24_CountConsonants {
    public static void main(String[] args) {
        
        String str = "vishal";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert to lowercase for easy checking
            ch = Character.toLowerCase(ch);

            // Check if it is a letter and not a vowel
            if (ch >= 'a' && ch <= 'z') {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Number of consonants: " + count);
    }
}
