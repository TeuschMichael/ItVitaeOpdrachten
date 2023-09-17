import java.util.Scanner;
public class CheckIfNumberIsEvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int answer = input.nextInt();

        if (answer % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}