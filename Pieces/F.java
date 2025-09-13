package Pieces;

public class F extends Pentomino {
    public F(){
        piece[1][2] = piece[1][3] = 'F';
        piece[2][1] = piece[2][2] = 'F';
        piece[3][2] = 'F';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

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
}
