// 55. Write a Java program to accept 10 numbers and find the largest and smallest among them.not using array.
public class Q55_LargestSmallestNumber {
    public static void main(String[] args) {
        
            int[] arr = {1, -7, 0, 9, -3, 0, 5, -2, 8, 0} ;
            int largest = arr[0] ;
            int smallest = arr[0] ;

            for(int i = 1 ; i < arr.length ; i++ )
            {
                if(arr[i] > largest)
                {
                    largest = arr[i] ;
                }
                if(arr[i] < smallest)
                {
                    smallest = arr[i] ;
                }
            }
            System.out.println("Largest Number is : " + largest);
            System.out.println("Smallest Number is : " + smallest);
    }
}
