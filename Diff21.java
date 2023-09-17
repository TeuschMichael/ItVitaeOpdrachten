public class Diff21 {

    public static void main(String[] args) {

        System.out.println(diff(9));
        System.out.println(diff(50));
    }

    public static int diff(int n) {
        if (n > 21) {
            return Math.abs(21 - n) * 2;
        }

        return Math.abs(21 - n);

    }


}