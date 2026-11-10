import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my SWE Journey!");
        System.out.print("What is your name? ");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Let's build something great.");
        
        scanner.close();
    }
}