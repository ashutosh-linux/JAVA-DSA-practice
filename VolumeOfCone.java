import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;

        System.out.println("Volume of Cone = " + volume);

        sc.close();
    }
}

