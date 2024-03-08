package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite); //calling Piece constructor with color value
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        //check for horizontal movement:
        if (Math.abs(destinationX - startX) == (Math.abs(destinationY - startY))) {
             int xDirection = destinationX > startX ? 1: -1; //determine if piece is moving to the right
            //ie if the destination square as a higher value
        }
        return false;
    }
}
