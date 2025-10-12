public class Q60_PattenOfNum {
    
     public static void main(String[] args) {
        
        int num = 1; // start number
        
        for(int i = 1; i <= 5; i++) // controls the rows
        {
            for(int j = 1; j <= i; j++) // prints increasing numbers in each row
            {
                System.out.print(num);
                num++; // move to next number
            }
            System.out.println(); // next line
        }
}
}