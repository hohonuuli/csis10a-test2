
/**
 * Write a description of class ReverseString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReverseString {
    public static String reverse1(String s) {
        String out = "";
        int i = s.length() - 1;
        while (i >= 0) {
            out = out + s.charAt(i);
            i--;
        }
        return out;
    }
    
    public static String reverse2(String s) {
        String out = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            out = out + s.charAt(i);
        }
        return out;
    }
    
    public static String reverse3(String s) {
        if (s.length() == 1) return s;
        else {
            char last = s.charAt(s.length() - 1);
            String head = s.substring(0, s.length() - 1);
            return last + reverse3(head);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(reverse1("ymca1"));
        System.out.println(reverse2("ymca2"));
        System.out.println(reverse3("ymca3"));
    }
}
