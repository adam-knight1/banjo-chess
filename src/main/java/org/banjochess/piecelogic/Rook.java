package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {

        int deltaX = Math.abs(destinationX - startX);
        int deltaY = Math.abs(destinationY - startY);

        return false;
    }
}
