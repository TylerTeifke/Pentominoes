package Pieces;

public class U extends Pentomino {
    public U(){
        piece[1][1] = piece[1][3] = 'U';
        piece[2][1] = piece[2][2] = piece[2][3] = 'U';
    }

    public void rotate(int degrees){
        super.rotate(degrees);
        
        if(degrees == 90){
            piece[1][2] = piece[1][3] = 'U';
            piece[2][2] = 'U';
            piece[3][2] = piece[3][3] = 'U';
        }
        else if(degrees == 180){
            piece[2][1] = piece[2][2] = piece[2][3] = 'U';
            piece[3][1] = piece[3][3] = 'U';
        }
        else if(degrees == 270){
            piece[1][1] = piece[1][2] = 'U';
            piece[2][2] = 'U';
            piece[3][1] = piece[3][2] = 'U';
        }
        else{
            piece[1][1] = piece[1][3] = 'U';
            piece[2][1] = piece[2][2] = piece[2][3] = 'U';
        }
    }
}
