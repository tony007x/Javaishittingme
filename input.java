import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?"); 
        String name = scanner.nextLine();  // Var string
        System.out.println("Hello "+name); // input

        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Var int
        System.out.println("You are "+age+" years old."); //input

        System.out.println(scanner);

    }
}
