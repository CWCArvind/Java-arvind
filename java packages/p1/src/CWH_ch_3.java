import java.util.Locale;
import java.util.Scanner;

public class CWH_ch_3 {
    public static void main(String[] args) {
       /*String name = new String ("Happy");
        System.out.println(name);
        char d = 'j';

        int a = 5;
        float c = 5.4f;
        System.out.printf("The value of b %d is  and the value of c is % f and the name is %S ",a,c,name );

        System.out.format("d represents %c",d);
        Scanner S = new Scanner(System.in);
        String Arv =S.nextLine();
        System.out.println(Arv);
        String s = "Arvind";
        System.out.println(s);
        Scanner S = new Scanner(System.in);
        String st = S.nextLine();
        System.out.println(st);
        float d = 5.8964f;
        String str = "Radha Krishna";

        System.out.printf("only chant %s and value of d is %5.2f",str,d);*/
        String name = "Arvind";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(4));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('A','B'));
        System.out.println(name.replace("A","Bhuvnesh"));
        System.out.println(name.replace("","Bhuvnesh"));
        System.out.println(name.startsWith("A"));
        System.out.println(name.charAt(3));
        String modifiedname = "Arvindind";
        System.out.println(modifiedname.lastIndexOf('n',4));
        System.out.println(name.equalsIgnoreCase("arvind"));
        System.out.println("\"Arvind\"\n \"Bhu\tvnesh\"");

    }
}
