import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int num;
        
        System.out.println("Enter numbers (enter 0 to stop):");
        
        while(true) {
            num = sc.nextInt();
            
            if(num == 0) {
                break;
            }
            
            if(num > largest) {
                largest = num;
            }
        }
        
        System.out.println("Largest number: " + largest);
        
        sc.close();
    }
}
