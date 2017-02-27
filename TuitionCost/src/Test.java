import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the initial tuition cost (Format XXXX.00).");
		double a = keyboard.nextDouble();
		
		System.out.println("Enter the whole percentage of interest");
		double b = keyboard.nextDouble();
		
		TuitionCost test = new TuitionCost(a,b);
		System.out.print(test.calcTuitionCost());

	}

}
