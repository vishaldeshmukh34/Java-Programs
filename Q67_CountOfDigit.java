public class Q67_CountOfDigit {
    
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        while(num > 0) {
            int digit = num % 10;
           
            count++;

            num = num / 10;
        }
        System.out.println("count of digits = " + count);
    }
}
