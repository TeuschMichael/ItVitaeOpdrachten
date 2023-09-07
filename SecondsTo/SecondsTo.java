import java.util.Scanner;
public class SecondsTo {

public static void main(String[] args) {

		convert(100);

}

public static void convert(int a) {

	int hours = a / 3600;
	int minutes = (a % 3600) / 60;
	int seconds = a % 60;

  System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
}
}
