import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @org.junit.jupiter.api.Test
    void aWinner() {
        int SIZE = 3;
        boolean[][] minefield = new boolean[SIZE][SIZE];
        minefield[1][0] = true;
        boolean[][] revealed = new boolean[SIZE][SIZE];
        revealed[0][0] = true;
        revealed[0][1] = true;
        revealed[0][2] = true;

        revealed[1][1] = true;
        revealed[1][2] = true;
        revealed[2][0] = true;
        revealed[2][1] = true;
        revealed[2][2] = true;
        assertTrue(Minesweeper.hasWon(minefield, revealed));
    }

    @org.junit.jupiter.api.Test
    void aLoser() {
        int SIZE = 3;
        boolean[][] minefield = new boolean[SIZE][SIZE];
        minefield[1][0] = true;
        boolean[][] revealed = new boolean[SIZE][SIZE];

        revealed[0][1] = true;
        revealed[0][2] = true;

        revealed[1][1] = true;
        revealed[1][2] = true;
        revealed[2][0] = true;
        revealed[2][1] = true;
        revealed[2][2] = true;
        assertFalse(Minesweeper.hasWon(minefield, revealed));
    }

    @org.junit.jupiter.api.Test
    void initMinefield() {
        int SIZE = 3;
        int NUM_MINES = 6;
        boolean[][] minefield = new boolean[SIZE][SIZE];
        Minesweeper.initMinefield(minefield, NUM_MINES);
        int count = 0;
        for (int x = 0; x < SIZE; ++x) {
            for (int y = 0; y < SIZE; ++y) {
                if (minefield[x][y]) {
                    count = count + 1;
                }
            }
        }
        assertEquals(NUM_MINES, count);
    }
}