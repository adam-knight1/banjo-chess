package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        return false;
    }
}
