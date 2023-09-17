public class NotString {

    public static void main(String[] args) {

        System.out.println(add("Hallo dit is een string"));

    }
    public static String add(String a) {
        String add = "not";
        String diff = a.substring(0, 3);
        System.out.println(a);

        if (add.equals(diff)) {

            //		System.out.println(result);
            return a;
        } else {
            String result = add + a;
            return result;
        }


    }

}