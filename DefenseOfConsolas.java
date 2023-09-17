import java.util.Scanner;
public class DefenseOfConsolas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the row");
        int row = input.nextInt();

        System.out.println("Please enter the column");
        int column = input.nextInt();

        deployment(row, column);

    }

    public static void deployment(int row, int column) {

        for (int i = 0; i < row; i++) {
            for (i = 0; i < column; i++) {
                System.out.println(row + 1);
                //		System.out.println("Hi");

            }

        }

    }
}