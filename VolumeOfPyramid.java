import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base length: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3.0) * base * base * height;

        System.out.println("Volume of Pyramid = " + volume);

        sc.close();
    }
}

