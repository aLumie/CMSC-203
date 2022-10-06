import java.util.Scanner;

public class App {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    //declare variables
    int month,date,year; 
    
    String Month =""; 
    
    String dateString=""; 
    
    System.out.println("Month:");
    month=sc.nextInt();  //Read month by the user
    
    System.out.println("Date:");
    date=sc.nextInt();  //Read date by the user
    
    System.out.println("Year:");
    year=sc.nextInt(); //Read year by the user
    
    switch(month){
    
    case 1:
    Month="January";
    break;
    
    case 2:
    Month="February";
    break;
    
    case 3:
    Month="March";
    break;
    
    case 4:
    Month="April";
    break;
    
    case 5:
    Month="May";
    break;
    
    case 6:
    Month="June";
    break;
    
    case 7:
    Month="July";
    break;
    
    case 8:
    Month="August";
    break;
    
    case 9:
    Month="September";
    break;
    
    case 10:
    Month="October";
    break;
    
    case 11:
    Month="November";
    break;
    
    case 12:
    Month="December";
    break;
    
    default:
    System.out.println("\nThe user input is an Invalid Month");
    break;
}

if (1 <= date && date >= 31) //condition that prevents the given value to
{
    System.out.println("The user input is an Invalid Date");
    System.out.println("Please try again\n");
}
else //print the output by the user
System.out.print(Month + " " +  date + "," + " " +  year);  

}
}






 

