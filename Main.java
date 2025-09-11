import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        board.print_out();

        System.out.println("");
        System.out.println("T piece");
        T t = new T();
        t.print_out();
        t.rotate(90);
        System.out.println("90 degrees");
        t.print_out();
        t.rotate(180);
        System.out.println("180 degrees");
        t.print_out();
        t.rotate(270);
        System.out.println("270 degrees");
        t.print_out();
        t.rotate(0);
        System.out.println("0 degrees");
        t.print_out();
    }
}
