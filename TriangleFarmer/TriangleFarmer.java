import java.util.Scanner;
public class TriangleFarmer {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the base dimension:");
		int base = input.nextInt();
		System.out.println("Please enter the height dimension:");
		int height = input.nextInt();
		
		System.out.println((base * height) / 2);
		
		
	
}
}