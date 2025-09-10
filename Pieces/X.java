package Pieces;
/**
 * Will create the + pentomino
 */

public class X extends Pentomino {
    public X(){
        piece[1][2] = 'X';
        piece[2][1] = piece[2][2] = piece[2][3] = 'X';
        piece[3][2] = 'X';
    }
}
