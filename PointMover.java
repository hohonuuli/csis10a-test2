import javafx.geometry.Point2D;
/**
 * Write a description of class PointMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PointMover {
    
    public static Point2D move(Point2D p, double x, double y) {
        return new Point2D(p.getX() + x, p.getY() + y);
    }
    
    public static void main(String[] args) {
        System.out.println(move(new Point2D(0, 0), 1, 2));
        System.out.println(move(new Point2D(1, 2), 10, 100));
    }
   
}
