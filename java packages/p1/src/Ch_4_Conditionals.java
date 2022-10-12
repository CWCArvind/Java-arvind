import java.util.Scanner;

public class Ch_4_Conditionals {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

      /*  int age = 12;
        boolean cond = (age==18);

        if(cond) {
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No boy you cannot drive,yet!");
        }
        boolean c = true;

        int a = 8;
        if(a==1||age==8){
            System.out.println("Yes");}
        else {
            System.out.println(!c);
        }*/
       /* System.out.println("Your age");
        int age = S.nextInt();

        if (age <= 12) {
            System.out.println("Parents should taught atticates to their childrens.");
        }
        else if(age<=18 && age>=12){
            System.out.println("You should study hard for your exams.");
        }
        else if(age>=18&&age<=25) {
            System.out.println("You should learn coding and establish some digital product in the market");
        }
        else if (age>=25&&age<=30) {
            System.out.println("You should work hard on your existing product or should establish another product");
        }
        else if(age>=30&&age<=60) {
            System.out.println("You should explore the world and god and enjoy your life all the time");
        }
            else {
                System.out.println("Enjoy your life!");
            }*/
     // switch case conditional:
        int age = 12 ;
        switch (age) {
            case 15 ->{System.out.println("gjy");
                       System.out.println("gjy");
                     System.out.println("gjy");}
            case 24 -> System.out.println("hbiuhu");
            case 25 -> System.out.println("hbi");
            default -> System.out.println("Enjoy");
        }

        //Switch case statement recall
        System.out.print("Your name:");

        String Your_Name = S.nextLine();

        switch (Your_Name) {
            case "Arvind" -> {
                System.out.println("You have two elder brothers");

            }
            case "Shivam" -> {
                System.out.println("You have no brother");

            }
            case "Ashwani" -> {
                System.out.println("You don't want to have any brother, so you don't have");

            }
            default -> System.out.println("You are Awesome.");
        }

    }
}
