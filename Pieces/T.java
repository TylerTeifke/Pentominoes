package Pieces;

public class T extends Pentomino {
    public T(){
        piece[1][1] = piece[1][2] = piece[1][3] = 'T';
        piece[2][2] = 'T';
        piece[3][2] = 'T';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        if(degrees == 90){
            piece[1][3] = 'T';
            piece[2][1] = piece[2][2] = piece[2][3] = 'T';
            piece[3][3] = 'T';
        }
        else if(degrees == 180){
            piece[1][2] = 'T';
            piece[2][2] = 'T';
            piece[3][1] = piece[3][2] = piece[3][3] = 'T';
        }
        else if(degrees == 270){
            piece[1][1] = 'T';
            piece[2][1] = piece[2][2] = piece[2][3] = 'T';
            piece[3][1] = 'T';
        }
        else{
            piece[1][1] = piece[1][2] = piece[1][3] = 'T';
            piece[2][2] = 'T';
            piece[3][2] = 'T';
        }
    }
}
