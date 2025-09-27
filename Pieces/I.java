package Pieces;

public class I extends Pentomino {
    public I(){
        piece[0][2] = 'I';
        piece[1][2] = 'I';
        piece[2][2] = 'I';
        piece[3][2] = 'I';
        piece[4][2] = 'I';

        top = 2;
        bottom = 2;
        left = 0;
        right = 0;
    }

    public void rotate(int degrees){
        super.rotate(degrees);
        
        if(degrees == 90){
            piece[2][0] = piece[2][1] = piece[2][3] = piece[2][4] = piece[2][2] = 'I';
            top = 0;
            bottom = 0;
            left = 2;
            right = 2;
        }
        else{
            piece[0][2] = 'I';
            piece[1][2] = 'I';
            piece[2][2] = 'I';
            piece[3][2] = 'I';
            piece[4][2] = 'I';

            top = 2;
            bottom = 2;
            left = 0;
            right = 0;
        }
    }
}
