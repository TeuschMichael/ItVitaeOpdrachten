public class or35{

public static void main(String[] args) {

	System.out.println(or35(3));
	System.out.println(or35(10));
	System.out.println(or35(8));

}

	public static boolean or35(int a){
		if(a % 3 == 0 || a % 5 ==0) {
		return true; 
		} else {
		return false; }
}
}