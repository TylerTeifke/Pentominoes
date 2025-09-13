package Pieces;

public class Flipped_L extends Pentomino {
    public Flipped_L(){
        piece[1][2] = 'L';
        piece[2][2] = 'L';
        piece[3][2] = 'L';
        piece[4][1] = piece[4][2] = 'L';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][0] = 'L';
                piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';
                break;
            case 180:
                piece[1][2] = piece[1][3] = 'L';
                piece[2][2] = 'L';
                piece[3][2] = 'L';
                piece[4][2] = 'L';
                break;
            case 270:
                piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';
                piece[3][3] = 'L';
                break;
            default:
                piece[1][2] = 'L';
                piece[2][2] = 'L';
                piece[3][2] = 'L';
                piece[4][1] = piece[4][2] = 'L';
                break;
        }
    }
}
