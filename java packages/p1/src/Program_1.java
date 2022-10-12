import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("School name:");
        String School_name = S.nextLine();
        System.out.print("School Address:");
        String School_Address = S.nextLine();
        System.out.print("Class:");
        String Class = S.nextLine();
        System.out.print("Section:");
        String Section = S.nextLine();
        System.out.print("Date of leave:");
        String Date_of_leave = S.nextLine();
        System.out.print("Your name:");
        String Your_name = S.nextLine();


        System.out.println("To,\n\nThe Principal,\n"+School_name+"\n"+School_Address+
                "\nSubject:Request one day leave for urgent piece of work.\n\nRespected Sir/Madam,\n\n\t" +
                "With due respect,I beg to state that,I am a student of \nclass "+Class+" "+ Section+" in your school." +
                "I have required one day leave\nbecause of a piece of work in the city.I need\n" +
                "to accompany with my grandma for shopping regarding to\n" +
                "upcoming wedding in my family.\n\nKindly, allow me leave for one day on "+Date_of_leave +
                "\n\n I shall be highly obliged to you.\n\nYours obediently,\n\n"+Your_name+" \nClass "+Class+" Section "+Section);







    }
}
