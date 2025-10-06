// 20. Write a program to accept a character and check whether it is a vowel or consonant.
public class Q20_VowelOrConsonant {
    public static void main(String[] args) {
        
        char ch = 'I';

        if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch +" is vowel");
        }
        else
        {
            System.out.println(ch +" Not is vowel");
        }


    }
}
