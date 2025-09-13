package Pieces;

public class Flipped_Z extends Pentomino {
    public Flipped_Z(){
        piece[1][1] = piece[1][2] = 'Z';
        piece[2][2] = 'Z';
        piece[3][2] = piece[3][3] = 'Z';
    }

    public void rotate(int degrees){
        super.rotate(degrees);

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
