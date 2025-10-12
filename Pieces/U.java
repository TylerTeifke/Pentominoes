package Pieces;

public class U extends Pentomino {
    public U(){
        piece[1][1] = piece[1][3] = 'U';
        piece[2][1] = piece[2][2] = piece[2][3] = 'U';

        top = 1;
        bottom = 0;
        left = 1;
        right = 1;
    }

    public void rotate(int degrees){
        super.rotate(degrees);

        switch (degrees) {
            case 90:
                piece[1][2] = piece[1][3] = 'U';
                piece[2][2] = 'U';
                piece[3][2] = piece[3][3] = 'U';

                top = 1;
                bottom = 1;
                left = 0;
                right = 1;
                break;
            case 180:
                piece[2][1] = piece[2][2] = piece[2][3] = 'U';
                piece[3][1] = piece[3][3] = 'U';

                top = 0;
                bottom = 1;
                left = 1;
                right = 1;
                break;
            case 270:
                piece[1][1] = piece[1][2] = 'U';
                piece[2][2] = 'U';
                piece[3][1] = piece[3][2] = 'U';

                top = 1;
                bottom = 1;
                left = 1;
                right = 0;
                break;
            default:
                piece[1][1] = piece[1][3] = 'U';
                piece[2][1] = piece[2][2] = piece[2][3] = 'U';

                top = 1;
                bottom = 0;
                left = 1;
                right = 1;
                break;
        }
    }

    public boolean can_flip(){
        return false;
    }
}
