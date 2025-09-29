package Pieces;

public class P extends Pentomino {
    public P(){
        piece[1][2] = piece[1][3] = 'P';
        piece[2][2] = piece[2][3] = 'P';
        piece[3][2] = 'P';

        top = 1;
        bottom = 1;
        left = 0;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        if(!flipped){
            switch (degrees) {
                case 90:
                    piece[2][1] = piece[2][2] = piece[2][3] = 'P';
                    piece[3][2] = piece[3][3] = 'P';

                    top = 0;
                    bottom = 1;
                    left = 1;
                    right = 1;
                    break;
                case 180:
                    piece[1][2] = 'P';
                    piece[2][1] = piece[2][2] = 'P';
                    piece[3][1] = piece[3][2] = 'P';

                    top = 1;
                    bottom = 1;
                    left = 1;
                    right = 0;
                    break;
                case 270:
                    piece[1][1] = piece[1][2] = 'P';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'P';

                    top = 1;
                    bottom = 0;
                    left = 1;
                    right = 1;
                    break;
                default:
                    piece[1][2] = piece[1][3] = 'P';
                    piece[2][2] = piece[2][3] = 'P';
                    piece[3][2] = 'P';

                    top = 1;
                    bottom = 1;
                    left = 0;
                    right = 1;
                    break;
            }
        }
        else{
            switch (degrees) {
                case 90:
                    piece[1][2] = piece[1][3] = 'P';
                    piece[2][1] = piece[2][2] = piece[2][3] = 'P';

                    top = 1;
                    bottom = 0;
                    left = 1;
                    right = 1;
                    break;
                case 180:
                    piece[1][2] = 'P';
                    piece[2][2] = piece[2][3] = 'P';
                    piece[3][2] = piece[3][3] = 'P';

                    top = 1;
                    bottom = 1;
                    left = 0;
                    right = 1;
                    break;
                case 270:
                    piece[2][1] = piece[2][2] = piece[2][3] = 'P';
                    piece[3][1] = piece[3][2] = 'P';

                    top = 0;
                    bottom = 1;
                    left = 1;
                    right = 1;
                    break;
                default:
                    piece[1][1] = piece[1][2] = 'P';
                    piece[2][1] = piece[2][2] = 'P';
                    piece[3][2] = 'P';

                    top = 1;
                    bottom = 1;
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
            piece[1][1] = piece[1][2] = 'P';
            piece[2][1] = piece[2][2] = 'P';
            piece[3][2] = 'P';

            top = 1;
            bottom = 1;
            left = 1;
            right = 0;
        }
        else{
            piece[1][2] = piece[1][3] = 'P';
            piece[2][2] = piece[2][3] = 'P';
            piece[3][2] = 'P';

            top = 1;
            bottom = 1;
            left = 0;
            right = 1;
        }

        flipped = !flipped;
    }
}
