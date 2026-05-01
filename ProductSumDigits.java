import java.util.Scanner;

public class ProductSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int product = 1;
        int sum = 0;
        int temp = num;
        
        while(temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }
        
        int result = product - sum;
        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product - Sum = " + result);
        
        sc.close();
    }
}
