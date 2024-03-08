package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;

public class Bishop extends Piece {

    Board board;

    public Bishop(boolean isWhite) {
        super(isWhite); //calling Piece constructor with color value
    }

    /**
     * This will determine if the move is valid based on the rules of bishop movement
     *
     * @param board
     * @param startX
     * @param startY
     * @param destinationX
     * @param destinationY
     * @return true if valid move, false if invalid
     */
    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        //check for equal horizontal and vertical movement:
        if (Math.abs(destinationX - startX) == (Math.abs(destinationY - startY))) {
            int xDirection = destinationX > startX ? 1 : -1; //determine if piece is moving to the right
            //ie if the destination square as a higher value

            int yDirection = destinationY > startY ? 1 : -1; //positive is moving up along Y axis, negative moving down

            int steps = Math.abs(destinationX - startX); //number of total squares moved (based on X axis movement)

            //check for blocking pieces:

            for (int i = 1; i < steps; i++) {
                //starting from 1 because of starting position and -1 because of destination capture
                int xCurrent = startX + i * xDirection;
                int yCurrent = startY + i * yDirection;

                //Using the board.getPiece method to check if the square is occupied, null if it is not

                if (board.getPiece(xCurrent, yCurrent) != null) {
                    return false; //false if any square along path is blocked
                }
            }
            return true;  //if not false, the path is clear;
        }
        return false; //if the move is not diagonal per the first check
    }
}
