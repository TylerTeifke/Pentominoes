import Pieces.Pentomino;

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

    /*
     * This method will "place" a piece on the board by changing the area of the 
     * specified coordinates to that of the piece placed
     */
    public boolean place(Pentomino piece, int x_cord, int y_cord){
        
        //The center of the piece will be x_cord, y_cord. These variables will
        //be used to deviat from the center
        int top = piece.get_top();
        int bottom = piece.get_bottom();
        int left = piece.get_left();
        int right = piece.get_right();

        char[][] pentomino = piece.get_piece();
        //Will be used to track the x and y coordinates of the piece
        int piece_X = 0;
        int piece_Y = 0;

        for(int i = y_cord - top; i <= y_cord + bottom; i++){
            for(int j = x_cord - left; j <= x_cord + right; j++){
                if(pentomino[piece_X][piece_Y] != '0'){
                    board[i][j] = pentomino[piece_X][piece_Y];
                }
                piece_Y++;
            }
            piece_X++;
            piece_Y = 0;
        }
        return true;
    }
}
