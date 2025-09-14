package Pieces;

public class Flipped_N extends Pentomino {
    public Flipped_N(){
        piece[1][1] = 'N';
        piece[2][1] = piece[2][2] = 'N';
        piece[3][2] = 'N';
        piece[4][2] = 'N';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][2] = piece[1][3] = 'N';
                piece[2][0] = piece[2][1] = piece[2][2] = 'N';
                break;
            case 180:
                piece[1][2] = 'N';
                piece[2][2] = 'N';
                piece[3][2] = piece[3][3] = 'N';
                piece[4][3] = 'N';
                break;
            case 270:
                piece[2][1] = piece[2][2] = piece[2][3] = 'N';
                piece[3][0] = piece[3][1] = 'N';
                break;
            default:
                piece[1][1] = 'N';
                piece[2][1] = piece[2][2] = 'N';
                piece[3][2] = 'N';
                piece[4][2] = 'N';
                break;
        }
    }
}
