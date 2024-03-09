package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    /**
     * This method determines if the Rook follows standard chess rules
     *
     * @param board
     * @param startX
     * @param startY
     * @param destinationX
     * @param destinationY
     * @return True if valid move.  False if invalid or if path crosses same color piece
     */

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {

        int deltaX = Math.abs(destinationX - startX);
        int deltaY = Math.abs(destinationY - startY);

        if (!(deltaX == 0 || deltaY == 0)) {
            return false; //this means the movement was diagonal, not purely horizontal or vertical
        }

        //determine direction of piece by comparing start x and y to destination x and y,
        int xDirection = Integer.compare(destinationX, startX);
        int yDirection = Integer.compare(destinationY, startY);

        //finding any blocking pieces
        int distance = Math.max(deltaX, deltaY);

        for (int i = 1; i < distance; i++) {
            //x and y direction are either -1,0,-1 or left none or right movement along x axis
            //incrementing by i moves each count one square over
            int xCurrent = startX + i * xDirection;
            int yCurrent = startY + i * yDirection;
            Piece blockingPiece = board.getPiece(xCurrent, yCurrent);

            if (blockingPiece != null) {
                //piece is in the way of intended destination regardless of color
                return false;

            }
        }

        Piece destinationPiece = board.getPiece(destinationX, destinationY);

        if (destinationPiece != null && destinationPiece.isWhite() == this.isWhite()) {
            //checking to see if a piece
            //is blocking the rook's path, or if the piece is the same color (can't be captured)
            return false; //blocked + can't capture own piece
        }

        return true; //move is valid
    }
}
