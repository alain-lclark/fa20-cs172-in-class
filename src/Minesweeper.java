public class Minesweeper {

    public static void main(String[] args) {
        StdOut.println("Welcome to Minesweeper");

        int SIZE = 10;
        int NUM_MINES = 5;

        boolean[][] minefield = new boolean[SIZE][SIZE];
        boolean[][] revealed = new boolean[SIZE][SIZE];

        initMinefield(minefield, NUM_MINES);

        drawMinefield(minefield, revealed);
        while (!hasWon(minefield, revealed)) {
            processClick(minefield, revealed);
            drawMinefield(minefield, revealed);
        }
        if (hasWon(minefield, revealed)) {
            StdOut.println("You win!");
        }
    }

    public static boolean hasWon(boolean[][] minefield, boolean[][] revealed) {
        for (int x = 0; x < minefield.length; ++x) {
            for (int y = 0; y < minefield[x].length; ++y) {
                if (!(minefield[x][y] || revealed[x][y])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void processClick(boolean[][] minefield, boolean[][] revealed) {
    }

    public static void initMinefield(boolean[][] minefield, int numMines) {
    }

    public static void drawMinefield(boolean[][] minefield, boolean[][] revealed) {
    }

}
