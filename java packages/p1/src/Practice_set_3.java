import java.util.Locale;

public class Practice_set_3 {
    public static void main(String[] args) {
        String str = "Radha  Krishna";
      //  str = str.toLowerCase(Locale.ROOT);
      //  System.out.println(str);
       // System.out.println(str.replace(" ","_"));
        String letter = "\"Dear <|Arvind|>,Thanks   a lot\"";
        System.out.println(letter);
        letter = letter.replace("|Arvind|","|Yash|");
        System.out.println(letter);
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        String letter_ = "\"Dear Harry,\n\t This Java Course is nice.\n\t\t Thanks\"";
        System.out.println(letter_);






    }
}
