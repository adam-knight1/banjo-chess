package PieceTests;

import org.banjochess.Board;
import org.banjochess.piecelogic.Bishop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BishopTest {

    @Test
    void testBishopMovesDiagonallyEmptyBoard() {
        Board board = new Board();
        Bishop bishop = new Bishop(true);
        //board.placePiece(bishop, 2, 0); // Place bishop at c1

        Assertions.assertTrue(bishop.isValidMove(board, 2, 0, 4, 2), "Bishop should be able to move diagonally");
    }


}
