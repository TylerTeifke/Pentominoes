package Pieces;
/**
 * The super class that all pentominoes will inherit from
 */

public class Pentomino {
    protected char[][] piece = new char[5][5];
    protected boolean placed;

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
}
