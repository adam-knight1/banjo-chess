package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    /** This method checks to make sure the Knight's movement follows an L shape
     * and that it doesn't land on a piece of the same color.
     * @param board
     * @param startX
     * @param startY
     * @param destinationX
     * @param destinationY
     * @return True if valid move, false if invalid (wrong shape, same color piece on destination square)
     */
    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        //calculating the differences between start and end X and Y points
        int deltaX = Math.abs(destinationX - startX);
        int deltaY = Math.abs(destinationY - startY);

        //going to check for L shaped movement
        //two square down X and one up Y or
        //  two square up Y and acros X

        boolean isValidMove = ((deltaX == 2 && deltaY == 1)) || (deltaX == 1 && deltaY == 2); //Determine if piece moved in L shape

        if (!isValidMove) {
            return false;
        }

        Piece destinationPiece = board.getPiece(destinationX, destinationY); //find out what piece is on the landing spot for the knight

        //can't land on same color piece
        return destinationPiece == null || destinationPiece.isWhite() != this.isWhite();//move is valid!
    }
}

