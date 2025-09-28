package Pieces;

public class Z extends Pentomino {
    public Z(){
        piece[1][2] = piece[1][3] = 'Z';
        piece[2][2] = 'Z';
        piece[3][1] = piece[3][2] = 'Z';

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
                    piece[1][1] = 'Z';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'Z';
                    piece[3][3] = 'Z';
                    break;
                default:
                    piece[1][2] = piece[1][3] = 'Z';
                    piece[2][2] = 'Z';
                    piece[3][1] = piece[3][2] = 'Z';
                    break;
            }
        }
        else{
            switch (degrees) {
                case 90:
                    piece[1][3] = 'Z';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'Z';
                    piece[3][1] = 'Z';
                    break;
                default:
                    piece[1][1] = piece[1][2] = 'Z';
                    piece[2][2] = 'Z';
                    piece[3][2] = piece[3][3] = 'Z';
                    break;
            }
        }
    }

    public void flip(){
        //Will clear the grid
        super.rotate(0);

        if(!flipped){
            piece[1][1] = piece[1][2] = 'Z';
            piece[2][2] = 'Z';
            piece[3][2] = piece[3][3] = 'Z';
        }
        else{
            piece[1][2] = piece[1][3] = 'Z';
            piece[2][2] = 'Z';
            piece[3][1] = piece[3][2] = 'Z';
        }

        flipped = !flipped;
    }
}
