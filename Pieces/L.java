package Pieces;

public class L extends Pentomino {
    public L(){
        piece[1][2] = 'L';
        piece[2][2] = 'L';
        piece[3][2] = 'L';
        piece[4][2] = piece[4][3] = 'L';

        top = 1;
        bottom = 2;
        left = 0;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        if(!flipped){
            switch (degrees) {
                case 90:
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';
                    piece[3][0] = 'L';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][1] = piece[1][2] = 'L';
                    piece[2][2] = 'L';
                    piece[3][2] = 'L';
                    piece[4][2] = 'L';

                    top = 1;
                    bottom = 2;
                    left = 1;
                    right = 0;
                    break;
                case 270:
                    piece[1][3] = 'L';
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';

                    top = 1;
                    bottom = 0;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][2] = 'L';
                    piece[2][2] = 'L';
                    piece[3][2] = 'L';
                    piece[4][2] = piece[4][3] = 'L';

                    top = 1;
                    bottom = 2;
                    left = 0;
                    right = 1;
                    break;
            }
        }
        else{
            switch (degrees) {
                case 90:
                    piece[1][0] = 'L';
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';

                    top = 1;
                    bottom = 0;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][2] = piece[1][3] = 'L';
                    piece[2][2] = 'L';
                    piece[3][2] = 'L';
                    piece[4][2] = 'L';

                    top = 1;
                    bottom = 2;
                    left = 0;
                    right = 1;
                    break;
                case 270:
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'L';
                    piece[3][3] = 'L';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][2] = 'L';
                    piece[2][2] = 'L';
                    piece[3][2] = 'L';
                    piece[4][1] = piece[4][2] = 'L';

                    top = 1;
                    bottom = 2;
                    left = 1;
                    right = 0;
                    break;
            }
        }
    }

    public void flip(){
        //Will clear the grid
        super.rotate(0);

        if(!flipped){
            piece[1][2] = 'L';
            piece[2][2] = 'L';
            piece[3][2] = 'L';
            piece[4][1] = piece[4][2] = 'L';

            top = 1;
            bottom = 2;
            left = 1;
            right = 0;
        }
        else{
            piece[1][2] = 'L';
            piece[2][2] = 'L';
            piece[3][2] = 'L';
            piece[4][2] = piece[4][3] = 'L';

            top = 1;
            bottom = 2;
            left = 0;
            right = 1;
        }

        flipped = !flipped;
    }
}
