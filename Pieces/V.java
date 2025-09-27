package Pieces;

public class V extends Pentomino {
    public V(){
        piece[1][1] = 'V';
        piece[2][1] = 'V';
        piece[3][1] = piece[3][2] = piece[3][3] = 'V';

        top = 1;
        bottom = 1;
        left = 1;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][1] = piece[1][2] = piece[1][3] = 'V';
                piece[2][1] = 'V';
                piece[3][1] = 'V';
                break;
            case 180:
                piece[1][1] = piece[1][2] = piece[1][3] = 'V';
                piece[2][3] = 'V';
                piece[3][3] = 'V';
                break;
            case 270:
                piece[1][3] = 'V';
                piece[2][3] = 'V';
                piece[3][1] = piece[3][2] = piece[3][3] = 'V';
                break;
            default:
                piece[1][1] = 'V';
                piece[2][1] = 'V';
                piece[3][1] = piece[3][2] = piece[3][3] = 'V';
                break;
        }
    }
}
