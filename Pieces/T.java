package Pieces;

public class T extends Pentomino {
    public T(){
        piece[1][1] = piece[1][2] = piece[1][3] = 'T';
        piece[2][2] = 'T';
        piece[3][2] = 'T';

        top = 1;
        bottom = 1;
        left = 1;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][3] = 'T';
                piece[2][1] = piece[2][2] = piece[2][3] = 'T';
                piece[3][3] = 'T';
                break;
            case 180:
                piece[1][2] = 'T';
                piece[2][2] = 'T';
                piece[3][1] = piece[3][2] = piece[3][3] = 'T';
                break;
            case 270:
                piece[1][1] = 'T';
                piece[2][1] = piece[2][2] = piece[2][3] = 'T';
                piece[3][1] = 'T';
                break;
            default:
                piece[1][1] = piece[1][2] = piece[1][3] = 'T';
                piece[2][2] = 'T';
                piece[3][2] = 'T';
                break;
        }
    }
}
