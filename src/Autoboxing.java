public class Autoboxing {

    /*
     * boolean  Boolean
     * char     Character
     * double   Double
     * int      Integer
     */

    public static void main(String[] unused) {
        //Integer x = new Integer(17);
        Integer x = 17; // autoboxing (int -> Integer)
        int i = x; // autounboxing (Integer -> int)
        int j = Integer.parseInt("16");
    }
}
