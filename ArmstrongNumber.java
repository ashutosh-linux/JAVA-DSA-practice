import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        
        System.out.print("Armstrong numbers: ");
        
        for(int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(num).length();
            
            while(num > 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }
            
            if(sum == i) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}

