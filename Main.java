import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Before");
        board.print_out();

        T t = new T();
        X x = new X();
        U u = new U();
        u.rotate(180);
        u.print_out();

        board.place(x, 5, 3);
        board.place(t, 1, 3);
        board.place(u, 5, 1);
        System.out.println("After");
        board.print_out();
        //System.out.println(t.get_placed());
    }
}
