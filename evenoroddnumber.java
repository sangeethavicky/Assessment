/*
5. Write a program to check whether given number is even number or odd number8*/
import java.util.Scanner;

public class evenoroddnumber {
public static void main(String[]args)
		{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=scanner.nextInt();
	if(num%2==0)
	{
		System.out.println("This is Even number");
	}
	else
	{
		System.out.println("This is Odd numer");
	}
			
		}
}
