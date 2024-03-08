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

        if (deltaX != 0 || deltaY != 0) {
            return false; //this means the movement was diagonal, not purely horizontal or vertical

        }

        //determine direction of piece by comparing start x and y to destination x and y
        int xDirection = Integer.compare(destinationX, startX);
        int yDirection = Integer.compare(destinationY,startY);

        if (board.getPiece(destinationX,destinationY) != null) {

        }

        return false;
    }
}
