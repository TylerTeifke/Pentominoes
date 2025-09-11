package Pieces;

public class I extends Pentomino {
    public I(){
        piece[0][2] = 'I';
        piece[1][2] = 'I';
        piece[2][2] = 'I';
        piece[3][2] = 'I';
        piece[4][2] = 'I';
    }

    public void rotate(int degrees){
        super.rotate(degrees);
        
        if(degrees == 90){
            piece[2][0] = piece[2][1] = piece[2][3] = piece[2][4] = piece[2][2] = 'I';
        }
        else{
            piece[0][2] = 'I';
            piece[1][2] = 'I';
            piece[2][2] = 'I';
            piece[3][2] = 'I';
            piece[4][2] = 'I';
        }
    }
}
