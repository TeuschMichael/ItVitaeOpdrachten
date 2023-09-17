public class Max1020 {

    public static void main(String[] args) {

        System.out.println(diff(12, 9));
        System.out.println(diff(12, 19));
        System.out.println(diff(9, 15));
        System.out.println(diff(18, 12));

    }

    public static int diff(int a, int b) {

        if (a < 10 || b < 10 || a > 20 || b > 20) {
            return 0;
        }

        if (a > b) {
            return a;
        } else
            return b;

    }
}

