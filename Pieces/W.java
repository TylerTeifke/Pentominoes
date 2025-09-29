package Pieces;

public class W extends Pentomino {
    public W(){
        piece[1][1] = 'W';
        piece[2][1] = piece[2][2] = 'W';
        piece[3][2] = piece[3][3] = 'W';

        top = 1;
        bottom = 1;
        left = 1;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][2] = piece[1][3] = 'W';
                piece[2][1] = piece[2][2] = 'W';
                piece[3][1] = 'W';
                break;
            case 180:
                piece[1][1] = piece[1][2] = 'W';
                piece[2][2] = piece[2][3] = 'W';
                piece[3][3] = 'W';
                break;
            case 270:
                piece[1][3] = 'W';
                piece[2][2] = piece[2][3] = 'W';
                piece[3][1] = piece[3][2] = 'W';
                break;
            default:
                piece[1][1] = 'W';
                piece[2][1] = piece[2][2] = 'W';
                piece[3][2] = piece[3][3] = 'W';
                break;
        }
    }
}
