import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount in rupees: ");
        double rupees = sc.nextDouble();
        
        double usd = rupees / 94.12;
        
        System.out.println("USD: " + usd);
        
        sc.close();
    }
}

