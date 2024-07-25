package lab2b;
import java.util.Random;
import java.util.Scanner;
public class Random_num3
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);

	Random random = new Random();

    // Generate a random number between 1 and 100 (inclusive)
    int randomNum = random.nextInt(100) + 1;
    int count=0;
    System.out.println(randomNum);

    while(true)
    {

    	System.out.println("Guess any number in between 1 to 100 ");
    	 int num = sc.nextInt();
    	count++;

        if(num<randomNum)
        {
        	System.out.println("num is less than random number");


        }
        else if(num>randomNum)
        {
        	System.out.println("num is greater than random number");


        }

        else
        {
        	System.out.println("num is correct");
        	System.out.println("Your number is correct in " +count+ " succesfull attempt");
        	break;
        }

    }

}
}
