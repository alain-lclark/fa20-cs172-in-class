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
    void initMinefield() {
    }
}