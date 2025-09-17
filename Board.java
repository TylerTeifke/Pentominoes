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

    //Will determine if a piece is overlapping with another
    private boolean overlap(int top, int bottom, int left, int right, int x_cord, int y_cord, char[][] pentomino){
        int piece_X = 0;
        int piece_Y = 0;

        for(int i = y_cord - top; i <= y_cord + bottom; i++){
            for(int j = x_cord - left; j <= x_cord + right; j++){
                if(board[i][j] != '0' && pentomino[piece_Y][piece_X] != '0'){
                    return true;
                }
                piece_X++;
            }
            piece_X = 0;
            piece_Y++;
        }
        return false;
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

        //If the piece would fall outside the board, return false
        if(x_cord - left < 0 || x_cord + right >= 10 || y_cord - top < 0 || y_cord + bottom >= 6 
        || overlap(top, bottom, left, right, x_cord, y_cord, pentomino)){
            System.out.println("Cannot place that piece there");
            return false;
        }

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
        piece.set_placed(true);
        return true;
    }
}
