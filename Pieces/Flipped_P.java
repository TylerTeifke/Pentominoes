package Pieces;

public class Flipped_P extends Pentomino {
    public Flipped_P(){
        piece[1][1] = piece[1][2] = 'P';
        piece[2][1] = piece[2][2] = 'P';
        piece[3][2] = 'P';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][2] = piece[1][3] = 'P';
                piece[2][1] = piece[2][2] = piece[2][3] = 'P';
                break;
            case 180:
                piece[1][2] = 'P';
                piece[2][2] = piece[2][3] = 'P';
                piece[3][2] = piece[3][3] = 'P';
                break;
            case 270:
                piece[2][1] = piece[2][2] = piece[2][3] = 'P';
                piece[3][1] = piece[3][2] = 'P';
                break;
            default:
                piece[1][1] = piece[1][2] = 'P';
                piece[2][1] = piece[2][2] = 'P';
                piece[3][2] = 'P';
                break;
        }
    }
}
