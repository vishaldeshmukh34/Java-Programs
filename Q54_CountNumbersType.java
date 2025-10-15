// 54. Write a Java program to accept 10 numbers and count how many are positive, negative, or zero.
public class Q54_CountNumbersType {
    public static void main(String[] args) {
        
            int[] arr = {1, -7, 0, 9, -3, 0, 5, -2, 8, 0} ;
            int pos = 0 ;
            int neg = 0 ;
            int zero = 0 ;

            for(int i = 0 ; i < arr.length ; i++ )
            {
                if(arr[i] > 0)
                {
                    pos++ ;
                }
                else if(arr[i] < 0)
                {
                    neg++ ;
                }
                else
                {
                    zero++ ;
                }
            }
            System.out.println("Positive Numbers are : " + pos);
            System.out.println("Negative Numbers are : " + neg);
            System.out.println("Zero Numbers are : " + zero);
    }
}
