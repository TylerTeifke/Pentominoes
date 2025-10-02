import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Before");
        board.print_out();

        T t = new T();
        //t.rotate(270);
        X x = new X();
        U u = new U();
        //u.rotate(180);
        I i = new I();
        i.rotate(90);
        V v = new V();
        v.rotate(270);
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
        L l = new L();
        l.flip();
        l.rotate(90);
        
        board.place(x, 1, 2);
        //board.place(t, 4, 3);
        //board.place(u, 1, 4);
        //board.place(i, 2, 5);
        //board.place(v, 2, 1);
        //board.place(z, 4, 2);
        //board.place(f, 3, 3);
        //board.place(y, 9, 3);
        //board.place(w, 7, 3);
        //board.place(n, 7, 4);
        //board.place(p, 1, 0);
        //board.place(l, 8, 1);
        System.out.println("After");
        System.out.println(board.validate(1, 2, -1, 1));
        board.print_out();
    }
}
