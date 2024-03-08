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

            int yDirection = destinationY > startY ? 1: -1; //positive is moving up along Y axis, negative moving down

            int steps = Math.abs(destinationX - startX); //number of total squares moved (based on X axis movement)

            //check for blocking pieces:

            for (int i = 1; i < steps;i++){
                //starting from 1 because of starting position and -1 because of destination capture
                int xCurrent = startX + i * xDirection;


        }
        return false;
    }
}
