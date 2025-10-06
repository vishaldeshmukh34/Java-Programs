// 9. Write a Java program to swap two numbers using a third variable.


public class Q9_SwapUsingThirdVariable {
    public static void main(String[] args) {
        

             int a = 10 ;
              int b = 20 ;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println(a);
            System.out.println(b);


    }
}
