public class TheMagicCannon {
  public static void main(String[] args) {

    String ANSI_RED = "\u001b[31m";
    String ANSI_YELLOW = "\033[0;33m";
    String ANSI_RESET = "\033[0m";

    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.println(ANSI_RED + i);
        System.out.println(ANSI_RESET);
      }
    }
  }
}