public class LastDigit {

public static void main (String[] args) {

	System.out.println(lastDigit(7, 17));
	System.out.println(lastDigit(6, 17));
	System.out.println(lastDigit(3, 113));

}

public static boolean lastDigit(int a, int b) {

	if(a % 10  == b % 10) {
	return true; 
	} else {
	return false;}


}

}