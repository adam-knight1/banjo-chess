package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        return false;
    }
}
