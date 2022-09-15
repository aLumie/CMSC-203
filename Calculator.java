import java.util.Scanner;


public class App{

    static Scanner scanner;
    public static void main(String[] args) throws Exception {
        
        scanner = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Input the first number : ");
        num1 = scanner.nextDouble();

        System.out.println("Input the second number : ");
        num2 = scanner.nextDouble();

        System.out.print("Result:" + "\n");
        result = num1 + num2;
        System.out.println(result);
    }
}
