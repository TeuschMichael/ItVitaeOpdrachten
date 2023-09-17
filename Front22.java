public class Front22 {

    public static void main(String[] args) {

        front("Thisisastring");

    }

    public static void front(String a) {
        String add = a.substring(0, 2);
        System.out.println(add + a + add);

    }

}