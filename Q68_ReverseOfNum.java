public class Q68_ReverseOfNum {
    
    public static void main(String[] args) {
         int num = 12345 ;
      
      while(num != 0)
      
      {
          System.out.print("The Reverse Of Digit : -" +num%10);
          num = num / 10 ;
      }
    }
}
