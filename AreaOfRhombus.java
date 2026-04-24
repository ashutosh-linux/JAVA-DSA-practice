import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second diagonal: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus = " + area);

        sc.close();
    }
}

