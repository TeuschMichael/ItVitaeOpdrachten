import java.util.Scanner;
public class Dominion {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of provinces"); 
		int province = input.nextInt();
	
	System.out.println("Enter the number of duchies");
		int duchy = input.nextInt();
		
	System.out.println("Enter the number of estates");
	int estates = input.nextInt();
	
	total(province, duchy, estates);
	
	}

public static void total(int province, int duchies, int estates) {

	int total = (province * 6) + (duchies * 3) + estates;
	System.out.println(total);
}
}