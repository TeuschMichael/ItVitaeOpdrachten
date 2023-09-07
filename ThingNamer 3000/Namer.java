import java.util.Scanner;

public class Namer {
public static void main(String[] args) {

System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
// String a accepts user input
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
// String b is the input value of the user
String b = input.next();
// String c prints the "of Doom"text
String c = " of Doom";
// String d prints the numbers 3000
String d = "3000";
System.out.println("The " + b + " " + a + c + " " + d + "!");

}
}