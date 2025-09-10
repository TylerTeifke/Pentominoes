/**
 * The board class will be where we place our pieces. It is a 6x10 2D array
 */

public class Board {
    private char[][] board = new char[6][10];

    //Constructor that create an empty board
    public Board(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j <10; j++){
                board[i][j] = '0';
            }
        }
    }

    //Will print out the whole board
    public void print_out(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j <10; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
