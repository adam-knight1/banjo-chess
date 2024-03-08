package org.banjochess.piecelogic;

import org.banjochess.Board;
import org.banjochess.Piece;


public class Pawn extends Piece {
    public Pawn(boolean isWhite){
        super(isWhite); //calling Piece constructor with color value
    }

    @Override
    public boolean isValidMove(Board board, int startX, int startY, int destinationX, int destinationY) {
        // Implement pawn movement logic here, using startX, startY for the pawn's current positio

        int moveDirection = isWhite() ? 1 : -1;


        //+1 for white straight move, -1 for black straight move
        //if white = row one, two squares plus possible
        //if black = row six, two squares minus possible





        return false; // Placeholder return statement


    }


}
