public class Hanoi {

    static public void main(String[] unused) {
        move(4, 'A', 'B', 'C');
    }

    /**
     * Move n disks from the source peg to the destination peg with the help of the helper peg.
     */
    private static void move(int n, char source, char destination, char helper) {
        if (n == 1) {
            StdOut.printf("Move the top disc of peg %c to peg %c\n", source, destination);
        }
        else {
            move(n - 1, source, helper, destination);
            move(1, source, destination, helper);
            move(n - 1, helper, destination, source);
        }
    }
}
