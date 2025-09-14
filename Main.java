import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        board.print_out();

        System.out.println("");
        System.out.println("Flipped Y piece");
        Flipped_Y y = new Flipped_Y();
        y.print_out();
        y.rotate(90);
        System.out.println("90 degrees");
        y.print_out();
        y.rotate(180);
        System.out.println("180 degrees");
        y.print_out();
        y.rotate(270);
        System.out.println("270 degrees");
        y.print_out();
        y.rotate(0);
        System.out.println("0 degrees");
        y.print_out();
    }
}
