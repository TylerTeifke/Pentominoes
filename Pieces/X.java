package Pieces;
/**
 * Will create the + pentomino
 */

public class X extends Pentomino {
    public X(){
        piece[1][2] = 'X';
        piece[2][1] = piece[2][2] = piece[2][3] = 'X';
        piece[3][2] = 'X';

        top = 1;
        bottom = 1;
        left = 1;
        right = 1;
    }

    @Override public void rotate(int degrees){
        System.out.println("Can't rotate the X piece");
    }

    public int max_degree(){
        return 0;
    }

    public boolean can_flip(){
        return false;
    }
}
