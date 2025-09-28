package Pieces;

public class Y extends Pentomino {
    public Y(){
        piece[1][2] = 'Y';
        piece[2][1] = piece[2][2] = 'Y';
        piece[3][2] = 'Y';
        piece[4][2] = 'Y';

        top = 1;
        bottom = 2;
        left = 1;
        right = 0;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        if(!flipped){
            switch (degrees) {
                case 90:
                    piece[1][2] = 'Y';
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';

                    top = 1;
                    bottom = 0;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][2] = 'Y';
                    piece[2][2] = 'Y';
                    piece[3][2] = piece[3][3] = 'Y';
                    piece[4][2] = 'Y';

                    top = 1;
                    bottom = 2;
                    left = 0;
                    right = 1;
                    break;
                case 270:
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';
                    piece[3][1] = 'Y';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][2] = 'Y';
                    piece[2][1] = piece[2][2] = 'Y';
                    piece[3][2] = 'Y';
                    piece[4][2] = 'Y';

                    top = 1;
                    bottom = 2;
                    left = 1;
                    right = 0;
                    break;
            }
        }
        else{
            switch (degrees) {
                case 90:
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';
                    piece[3][2] = 'Y';

                    top = 0;
                    bottom = 1;
                    left = 2;
                    right = 1;
                    break;
                case 180:
                    piece[1][2] = 'Y';
                    piece[2][2] = 'Y';
                    piece[3][1] = piece[3][2] = 'Y';
                    piece[4][2] = 'Y';

                    top = 1;
                    bottom = 2;
                    left = 1;
                    right = 0;
                    break;
                case 270:
                    piece[1][1] = 'Y';
                    piece[2][0] = piece[2][1] = piece[2][2] = piece[2][3] = 'Y';

                    top = 1;
                    bottom = 0;
                    left = 2;
                    right = 1;
                    break;
                default:
                    piece[1][2] = 'Y';
                    piece[2][2] = piece[2][3] = 'Y';
                    piece[3][2] = 'Y';
                    piece[4][2] = 'Y';

                    top = 1;
                    bottom = 2;
                    left = 0;
                    right = 1;
                    break;
            }
        }
    }

    public void flip(){
        //Will clear the grid
        super.rotate(0);

        if(!flipped){
            piece[1][2] = 'Y';
            piece[2][2] = piece[2][3] = 'Y';
            piece[3][2] = 'Y';
            piece[4][2] = 'Y';

            top = 1;
            bottom = 2;
            left = 0;
            right = 1;
        }
        else{
            piece[1][2] = 'Y';
            piece[2][1] = piece[2][2] = 'Y';
            piece[3][2] = 'Y';
            piece[4][2] = 'Y';

            top = 1;
            bottom = 2;
            left = 1;
            right = 0;
        }

        flipped = !flipped;
    }
}
