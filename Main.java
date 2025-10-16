import java.util.ArrayList;

import Pieces.*;

public class Main{
    public static void main(String[] args) {
        Board board = new Board();
        //System.out.println("Before");
        //board.print_out();

        T t = new T();
        //t.rotate(270);
        X x = new X();
        U u = new U();
        //u.rotate(90);
        I i = new I();
        //i.rotate(90);
        V v = new V();
        //v.rotate(270);
        Z z = new Z();
        //z.flip();
        F f = new F();
        //f.flip();
        //f.rotate(90);
        Y y = new Y();
        //y.flip();
        //y.rotate(90);
        W w = new W();
        //w.rotate(90);
        N n = new N();
        //n.flip();
        //n.rotate(270);
        P p = new P();
        //p.flip();
        //p.rotate(270);
        L l = new L();
        //l.flip();
        //l.rotate(270);
        //l.print_out();

        ArrayList<Pentomino> pieces = new ArrayList<>();
        pieces.add(l);
        pieces.add(p);
        pieces.add(n);
        pieces.add(w);
        pieces.add(y);
        pieces.add(f);
        pieces.add(z);
        pieces.add(v);
        pieces.add(i);
        pieces.add(t);
        pieces.add(u);
        
        board.place(x, 3, 2);
        //board.print_out();
        System.out.println(board.solve(pieces).size());
        //board.place(t, 1, 4);
        //board.place(u, 0, 1);
        //board.place(i, 5, 0);
        //board.place(v, 8, 4);
        //board.place(z, 6, 2);
        //board.place(f, 4, 2);
        //board.place(y, 3, 5);
        //board.place(w, 8, 1);
        //board.place(n, 8, 2);
        //board.place(p, 6, 4);
        //board.place(l, 3, 3);
        //System.out.println("After");
        //System.out.println(board.validate(4, 4, 0, 0));
        //board.print_out();
    }
}
