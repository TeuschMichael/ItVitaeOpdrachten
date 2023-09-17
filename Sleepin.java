class Sleepin {

    public static void main(String[] args) {

        System.out.println(sleeping(false, false));
        System.out.println(sleeping(true, false));
        System.out.println(sleeping(false, true));


    }

    public static boolean sleeping(boolean weekday, boolean vacation) {
        boolean sleepin = false;
        if (!weekday && !vacation) {
            return sleepin = true;
        } else if (weekday && !vacation) {
            return !sleepin;
        } else if (!weekday && vacation) {
            return sleepin;
        }
        return false;
    }
}