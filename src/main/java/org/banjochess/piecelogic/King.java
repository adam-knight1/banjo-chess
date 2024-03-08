package org.banjochess.piecelogic;

import org.banjochess.Piece;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        return false;
    }
}
