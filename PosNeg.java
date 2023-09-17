public class PosNeg {

    public static void main(String[] args) {

        System.out.println(diff(5, -1, true));
        System.out.println(diff(-1, -1, false));
        System.out.println(diff(-1, -1, true));

    }

    public static boolean diff(int a, int b, boolean c) {

        if (c) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }

    }
}