
/**
 * Write a description of class ShortString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShortString extends MyString {
    
    public  ShortString(String s) {
        super(s);
    }
    
    
    public void display() {
        String s = getString();
        if (s != null) {
            String out;
            if (s.length() == 1) {
                out = "" + s.charAt(0);
            }
            else {
                out = "" + s.charAt(0) + s.charAt(s.length() - 1);
            }
            System.out.println(out);
        }
    }
}
