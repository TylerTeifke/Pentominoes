import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        board.print_out();

        System.out.println("");
        System.out.println("Flipped L piece");
        Flipped_L l = new Flipped_L();
        l.print_out();
        l.rotate(90);
        System.out.println("90 degrees");
        l.print_out();
        l.rotate(180);
        System.out.println("180 degrees");
        l.print_out();
        l.rotate(270);
        System.out.println("270 degrees");
        l.print_out();
        l.rotate(0);
        System.out.println("0 degrees");
        l.print_out();
    }
}
