package Pieces;
/**
 * The super class that all pentominoes will inherit from
 */

public class Pentomino {
    protected char[][] piece = new char[5][5];
    protected boolean placed;

    //These will be used to determine where the relevant portions of a piece are
    protected int top;
    protected int bottom;
    protected int left;
    protected int right;

    public Pentomino(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                piece[i][j] = '0';
            }
        }

        placed = false;
    }

    public void print_out(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(piece[i][j]);
            }
            System.out.println();
        }
    }

    public void rotate(int degrees){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                piece[i][j] = '0';
            }
        }
    }

    //Will be used to get the relevant dimensions of a piece
    public int get_top(){
        return top;
    }
    public int get_bottom(){
        return bottom;
    }
    public int get_left(){
        return left;
    }
    public int get_right(){
        return right;
    }

    /*
     * Will return the relevant parts of a pentomino
     */
    public char[][] get_piece(){
        char[][] ret_piece = new char[5 - (top + bottom)][5 - (left + right)];
        //Will be used to keep track of the placment of the original piece
        int old_i = top;
        int old_j = left;

        for(int i = 0; i < 5 - (top + bottom); i++){
            for(int j = 0; j < 5 - (top + bottom); j++){
                ret_piece[i][j] = piece[old_i][old_j];
                old_j++;
            }
            old_i++;
            old_j = left;
        }

        return ret_piece;
    }
}
