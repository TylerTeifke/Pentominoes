import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Before");
        board.print_out();

        T t = new T();
        t.rotate(270);
        X x = new X();
        U u = new U();
        u.rotate(180);
        I i = new I();
        i.rotate(90);
        V v = new V();
        v.rotate(180);
        Z z = new Z();
        z.flip();
        F f = new F();
        f.flip();
        f.rotate(180);
        Y y = new Y();
        W w = new W();
        N n = new N();
        n.rotate(270);
        P p = new P();
        p.rotate(90);
        

        board.place(x, 1, 2);
        board.place(t, 1, 4);
        board.place(u, 1, 0);
        board.place(i, 3, 5);
        board.place(v, 4, 1);
        board.place(z, 4, 2);
        board.place(f, 3, 3);
        board.place(y, 9, 3);
        board.place(w, 7, 3);
        board.place(n, 7, 4);
        board.place(p, 7, 1);
        System.out.println("After");
        board.print_out();
    }
}
