package Pieces;

public class N extends Pentomino {
    public N(){
        piece[1][3] = 'N';
        piece[2][2] = piece[2][3] = 'N';
        piece[3][2] = 'N';
        piece[4][2] = 'N';

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
                    piece[2][0] = piece[2][1] = piece[2][2] = 'N';
                    piece[3][2] = piece[3][3] = 'N';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][3] = 'N';
                    piece[2][3] = 'N';
                    piece[3][2] = piece[3][3] = 'N';
                    piece[4][2] = 'N';

                    top = 1;
                    bottom = 2;
                    left = 0;
                    right = 1;
                    break;
                case 270:
                    piece[2][0] = piece[2][1] = 'N';
                    piece[3][1] = piece[3][2] = piece[3][3] = 'N';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][3] = 'N';
                    piece[2][2] = piece[2][3] = 'N';
                    piece[3][2] = 'N';
                    piece[4][2] = 'N';

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
                    piece[2][2] = piece[2][3] = 'N';
                    piece[3][0] = piece[3][1] = piece[3][2] = 'N';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][1] = 'N';
                    piece[2][1] = 'N';
                    piece[3][1] = piece[3][2] = 'N';
                    piece[4][2] = 'N';

                    top = 1;
                    bottom = 2;
                    left = 1;
                    right = 0;
                    break;
                case 270:
                    piece[2][1] = piece[2][2] = piece[2][3] = 'N';
                    piece[3][0] = piece[3][1] = 'N';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][1] = 'N';
                    piece[2][1] = piece[2][2] = 'N';
                    piece[3][2] = 'N';
                    piece[4][2] = 'N';

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
            piece[1][1] = 'N';
            piece[2][1] = piece[2][2] = 'N';
            piece[3][2] = 'N';
            piece[4][2] = 'N';

            top = 1;
            bottom = 2;
            left = 1;
            right = 0;
        }
        else{
            piece[1][3] = 'N';
            piece[2][2] = piece[2][3] = 'N';
            piece[3][2] = 'N';
            piece[4][2] = 'N';

            top = 1;
            bottom = 2;
            left = 0;
            right = 1;
        }

        flipped = !flipped;
    }
}
