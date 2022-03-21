/*
7. Write a program to print the grade for an student like if marks is between 90 to 100 then display as excellent, 80 to90 then good, 60 to 80 then just 
passed and if it is less than 60 then failed*/
import java.util.Scanner;
public class between {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the your mark: ");
		int mark=scanner.nextInt();
		if(mark>=90 && mark<=100)
		{
			System.out.println("You are Excellent");
		
		}
		else if(mark>=80 && mark<=90)
		{
			System.out.println("You are Good");
		
		}
		else if(mark>=60 && mark<=80)
		{
			System.out.println("You are just pass");
		}
		else if(mark<60)
		{
			System.out.println("You are failed");
		}
		else
		{
			System.out.println("Check the mark");
		}
	}

}
