package Pieces;

public class Flipped_Y extends Pentomino {
    public Flipped_Y(){
        piece[1][2] = 'Y';
        piece[2][2] = piece[2][3] = 'Y';
        piece[3][2] = 'Y';
        piece[4][2] = 'Y';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';
                piece[3][2] = 'Y';
                break;
            case 180:
                piece[1][2] = 'Y';
                piece[2][2] = 'Y';
                piece[3][1] = piece[3][2] = 'Y';
                piece[4][2] = 'Y';
                break;
            case 270:
                piece[1][1] = 'Y';
                piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';
                break;
            default:
                piece[1][2] = 'Y';
                piece[2][2] = piece[2][3] = 'Y';
                piece[3][2] = 'Y';
                piece[4][2] = 'Y';
                break;
        }
    }
}
