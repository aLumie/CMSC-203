import java.util.Scanner;


public class Act5Calculator {

    public static int add(int num1, int num2) { // creating new method for addition
        return num1 + num2;
    }
    
    public static int sub(int num1, int num2) { // creating new method for substraction
        return num1 - num2;
    }
    
    public static int multi(int num1, int num2) { // creating new method for multiplication
        return num1 * num2;
    }
    
    public static double div(int num1, int num2) { // creating new method for division
        return (double)num1 / num2;
    }
    
    public static int modulo(int num1, int num2) { // creating new method for modulo
        return num1 % num2;
    }
    
    public static long exponent(int base, int exp) { // creating new method for exponent
            long result = 1;
    
            while (exp != 0)
            {
                    result *= base;
                    --exp;
            }
        return result;
    }
    
       
    
    public static void main(String[] args) { // calling all my methods in here
     
        Scanner sc = new Scanner(System.in); // using scanner to get user input
        int calcAct; // declaring a local variable

        // using do/while loop
        do
        {
            System.out.println("[1] Add ");
            System.out.println("[2] Subtract ");
            System.out.println("[3] Multiply ");
            System.out.println("[4] Division ");
            System.out.println("[5] Modulo ");
            System.out.println("[6] Exponent ");
            System.out.println("[0] Quit ");
    
            System.out.println("Please select an operation above: ");       
            calcAct = sc.nextInt();
            int num1, num2;
            
            switch(calcAct) // using switch case to perform diff process in dff conditions
            {
                case 0: System.exit(0);

                case 1 : System.out.println("Enter the integers: ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("= " + add(num1, num2));
                             
                     break;
    
                case 2 : System.out.println("Enter the integers: ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("= " + sub(num1, num2));
                             
                     break;
    
                case 3 : System.out.println("Enter the integers: ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("= " + multi(num1, num2));
                             
                     break;
    
                case 4 : System.out.println("Enter the integers: ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("=  " + div(num1, num2));
                             
                     break;

                 case 5 : System.out.println("Enter the integers:  ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("= " + modulo(num1, num2));
                     break;
                
                case 6 : System.out.println("Enter the base and the exponent: ");
                     num1 = sc.nextInt();
                     num2 = sc.nextInt();
                     System.out.println("= " + exponent(num1, num2));
                             
                     break;
            }
                    
        }
        while(calcAct != 0);
        sc.close();
    }
}
