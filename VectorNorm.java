
/**
 * Write a description of class VectorNorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorNorm {
   public static double norm(double x, double y, double z) {
       return Math.sqrt(x * x + y * y + z * z);
    }
    
    public static void main(String[] args) {
        System.out.println(norm(2, 3, 4));
    }
}
