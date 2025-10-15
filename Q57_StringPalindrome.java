// 57. Write a Java program to check whether a string is a palindrome or not.
public class Q57_StringPalindrome {
    public static void main(String[] args) {
        
            String str = "MADAM" ;
            String rev = "" ;

            for(int i = str.length() - 1 ; i >= 0 ; i-- )
            {
                rev = rev + str.charAt(i) ;
            }
            if(str.equals(rev))
            {
                System.out.println(str + " is a Palindrome String");
            }
            else
            {
                System.out.println(str + " is not a Palindrome String");
            }
    }
}
