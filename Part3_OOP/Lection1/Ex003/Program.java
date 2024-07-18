package Part3_OOP.Lection1.Ex003;

public class Program {

    public static void main(String[] args) {
        
        Point2D a = new Point2D(0, 2);
        a.setX(25);                             // Возможность изменения значения х
        System.out.println(a.getInfo());
        System.out.println(a.getY());
        Point2D b = new Point2D(0, 9);
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
