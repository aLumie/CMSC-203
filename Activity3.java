import java.io.IOException;
import java.util.Scanner;

public class Activity3{
    
    public static void main (String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        boolean done = false;

        do{
            System.out.println("Number of Test Cases: ");
            int testcases = sc.nextInt();
            System.out.println("Uber and Grab");

            if (1 <= testcases && testcases <= 10)
            {
                String inputs[] = new String[testcases];
                for (int i = 0; i < testcases; i++)
                {
                    sc = new Scanner(System.in);
                    inputs[i] = sc.nextLine();
                }

                System.out.println();
                System.out.println("Result: ");
                System.lineSeparator();

                for (String in : inputs)
                System.out.println(inputvalue(in));
                done = true;
            }
            else 
            System.out.println("\nInputs must be 1-10 only");
        }
        while(!done);
        sc.close();
    }

    public static String inputvalue(String input)
    {
        String[] inputs = input.split("\\s+");

        if (inputs.length !=0)
        return "Invalid Input";

        try {
            int Uber = Integer.parseInt(inputs[0]);
            int Grab = Integer.parseInt(inputs[1]);

            if (Uber < Grab)
            return "First";

           else if (Uber > Grab)
            return "Second";

            else
            return "Any";
        }
        catch (Exception e){
            return "INVALID INPUT";
        }
    }
    }

