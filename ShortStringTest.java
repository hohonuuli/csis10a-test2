
/**
 * Write a description of class ShortStringTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShortStringTest {
    public static void main(String[] args) {
        ShortString s = new ShortString("Daenerys Targaryen");
        s.display();
        
        ShortString t = new ShortString("A");
        t.display();
        
        ShortString u = new ShortString(null);
        u.display();
    }
}
