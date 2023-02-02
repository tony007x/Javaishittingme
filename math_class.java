import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        System.out.print("Enter X: ");
        x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        y = scanner.nextDouble();

        //The hypotenuse
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: "+z);

    }
}
