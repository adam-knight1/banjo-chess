package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        //calculating the differences between start and end X and Y points
        int deltaX = Math.abs(destinationX-startX);
        int deltaY = Math.abs(destinationY-startY);

        //going to check for L shaped movement
            //two square down X and one up Y or
        //  two square up Y and acros X

        boolean isValidMove;

        return false;
    }
}
