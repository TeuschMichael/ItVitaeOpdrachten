import java.util.Scanner;
public class FourSisters {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number of eggs gathered");
		int eggs = input.nextInt();
		divide(eggs);
		
}
	public static void divide(int eggs) {
	int whole = eggs / 4;
	int bear = eggs % 4 ;
	
	System.out.println("The sisters get " + whole + " eggs " +
	" the bear gets " + bear);
	
}	

}