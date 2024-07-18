package Part3_OOP.Lection1.Ex001;

public class PointMethod {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        int ax = 5;
        int ay = 4;
        int bx = 8;
        int by = 8;
        System.out.println(distance(ax, ay, bx, by));
        // Создать точку 
        // Печать точки
    }
}
