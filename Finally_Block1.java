package Finally_Block_conceots;

import java.util.InputMismatchException;
import java.util.Scanner;

// if exception comes in try block then catch block execute if exception does't comes
//in try block catch block will not execute in both the case finally will execute always
public class Finally_Block1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)

	{
		try {
			System.out.println("Enter the age here");
			sc.nextInt();

		}

		catch (InputMismatchException v) {

			System.out.println("Enter the numeric value in age, please fill again");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age again");
			sc.next();

		}

		finally {

			System.out.println("I ma finally block I will execute always");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name here");
		sc.next();
	}

}
