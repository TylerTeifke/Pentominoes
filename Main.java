import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Before");
        board.print_out();

        X x = new X();

        board.place(x, 4, 2);
        System.out.println("After");
        board.print_out();
    }
}
