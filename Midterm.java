import java.util.*;
import java.util.Scanner;

class Midterm
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc= new Scanner(System.in);
        System.out.println("Number of Test Cases: ");

		Set<Integer> set=new HashSet<>();

                set.add(5);
		set.add(6);
		set.add(7);
		set.add(13);
		set.add(14);
		set.add(20);
		set.add(21);
		set.add(27);
		set.add(28);
		
		int t=sc.nextInt();
		while(t-->0){

		    int n=sc.nextInt();
		    int count=0;

		    while(n-->0){
		        int v=sc.nextInt();
		        if(!set.contains(v))count++;
		    }
		    System.out.println(8+count);
		}
	}
}
