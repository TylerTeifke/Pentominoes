import Pieces.Pentomino;
import java.util.ArrayList;

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

    //Private helper functions will tell if the spaces surrounding a space are already occupied
    private int top_taken(int x_cord, int y_cord){
        if(y_cord == 0 || board[y_cord - 1][x_cord] != '0'){
            return 1;
        }
        return 0;
    }
    private int bottom_taken(int x_cord, int y_cord){
        if(y_cord == 5 || board[y_cord + 1][x_cord] != '0'){
            return 1;
        }
        return 0;
    }
    private int left_taken(int x_cord, int y_cord){
        if(x_cord == 0 || board[y_cord][x_cord - 1] != '0'){
            return 1;
        }
        return 0;
    }
    private int right_taken(int x_cord, int y_cord){
        if(x_cord == 9 || board[y_cord][x_cord + 1] != '0'){
            return 1;
        }
        return 0;
    }

    //Will tell how spaces a space is surrounded by
    private int surrounded(int x_cord, int y_cord){
        int sorrunded_by = top_taken(x_cord, y_cord) +
                           bottom_taken(x_cord, y_cord) +
                           left_taken(x_cord, y_cord) +
                           right_taken(x_cord, y_cord);

        return sorrunded_by;
    }

    //Will clear all of the ones off the board
    private void clear_board(ArrayList<int[]> surrounded_squares){
        while(surrounded_squares.size() > 0){
            int x = surrounded_squares.get(0)[0];
            int y = surrounded_squares.get(0)[1];
            board[y][x] = '0';
            surrounded_squares.remove(0);
        }
    }

    /*
     * Will decide if a piece placement is a valid solution
     */
    public boolean validate(){
        //Will keep track of how many isolated squares there are
        int isolated = 0;

        //Will be used to determine which squares are surrounded by other squares so that 
        //they can be turned back to zeros
        ArrayList<int[]> surrounded_squares = new ArrayList<int[]>();

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                //Only check empty blocks
                if(board[i][j] == '0'){
                    int surrounded_by = surrounded(j, i);

                    //If there is one block that is completely surrounded,
                    //then the game cannot be completed
                    if(surrounded_by == 4){
                        clear_board(surrounded_squares);
                        return false;
                    }
                    if(surrounded_by == 3){
                        //Will mark spaces that are surrounded
                        board[i][j] = '1';
                        int[] cords = {j, i};
                        surrounded_squares.add(cords);
                        isolated++;
                    }
                }
            }
        }

        System.out.println(isolated);
        clear_board(surrounded_squares);
        //If there are not enough isolated blocks to fit a piece into,
        //then the game cannot be completed
        if(isolated >= 5){
            return false;
        }
        return true;
    }
}
