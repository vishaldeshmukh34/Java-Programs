public class Q63_PattrenOfAbc {
    
public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) // start from E and go backward
        {
            for (char j = 'A'; j <= i; j++) // print from A up to current i
            {
                System.out.print(j);
            }
            System.out.println(); // move to next line
        }
}
}
