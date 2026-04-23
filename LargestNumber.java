import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        
        if(a > b) {
            System.out.println(a + " is larger");
        } else if(b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("Both are equal");
        }
        
        input.close();
    }
}

