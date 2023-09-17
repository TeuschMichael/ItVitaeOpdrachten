import java.util.Scanner;
public class TriangleFarmer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base dimension:");
        int base = input.nextInt();
        Scanner.close();
        Scanner newInput = new Scanner(System.in);
        System.out.println("Please enter the height dimension:");
        int height = newInput.nextInt();

        System.out.println((base * height) / 2);



    }
}