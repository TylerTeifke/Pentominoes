package Pieces;

public class F extends Pentomino {
    public F(){
        piece[1][2] = piece[1][3] = 'F';
        piece[2][1] = piece[2][2] = 'F';
        piece[3][2] = 'F';

        top = 1;
        bottom = 1;
        left = 1;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        if(!flipped){
            switch (degrees) {
                case 90:
                    piece[1][2] = 'F';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'F';
                    piece[3][3] = 'F';
                    break;
                case 180:
                    piece[1][2] = 'F';
                    piece[2][2] = piece[2][3] = 'F';
                    piece[3][1] = piece[3][2] = 'F';
                    break;
                case 270:
                    piece[1][1] = 'F';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'F';
                    piece[3][2] = 'F';
                    break;
                default:
                    piece[1][2] = piece[1][3] = 'F';
                    piece[2][1] = piece[2][2] = 'F';
                    piece[3][2] = 'F';
                    break;
            }
        }
        else{
            switch (degrees) {
                case 90:
                    piece[1][3] = 'F';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'F';
                    piece[3][2] = 'F';
                    break;
                case 180:
                    piece[1][2] = 'F';
                    piece[2][1] = piece[2][2] = 'F';
                    piece[3][2] = piece[3][3] = 'F';
                    break;
                case 270:
                    piece[1][2] = 'F';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'F';
                    piece[3][1] = 'F';
                    break;
                default:
                    piece[1][1] = piece[1][2] = 'F';
                    piece[2][2] = piece[2][3] = 'F';
                    piece[3][2] = 'F';
                    break;
            }
        }
    }

    public void flip(){
        //Will clear the grid
        super.rotate(0);

        if(!flipped){
            piece[1][1] = piece[1][2] = 'F';
            piece[2][2] = piece[2][3] = 'F';
            piece[3][2] = 'F';
        }
        else{
            piece[1][2] = piece[1][3] = 'F';
            piece[2][1] = piece[2][2] = 'F';
            piece[3][2] = 'F';
        }
        flipped = !flipped;
    }
}
