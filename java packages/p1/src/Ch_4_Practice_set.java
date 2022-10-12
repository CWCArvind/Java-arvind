import java.util.Scanner;

public class Ch_4_Practice_set {
    public static void main(String[] args) {
       /* int a = 10;
        if(a == 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }*/
    //Result:I am not 11

        //Solution 2
    /*Scanner S = new Scanner(System.in);
    System.out.println("Marks in Maths");
    float a = S.nextInt();
    System.out.println("Marks in Physics");
    float b = S.nextInt();
    System.out.println("Marks in Chemistry");
    float c = S.nextInt();
    float p = (a+b+c)/3.0f;
    if(a>=33 && b>=33 && c>=33 && p>=40) {
        System.out.println("Pass");
    }
    else {
        System.out.println("Fail");
    }*/

        // solution to problem no. 3
       /* Scanner S = new Scanner(System.in);
        System.out.print("Your Income Dear(in lakhs):");
        Float Income = S.nextFloat();
        if (Income>=2.5f&&Income<=5.0f) {
            float tax = 5/100.0f*Income;
            System.out.println("You have to pay 5% tax on your income which comes to be : "+tax+"lakhs");

        }
        else if(Income>=5.0f && Income<=10.0f) {
            float tax = 20/100.0f*Income;

            System.out.println("You have to pay 20% tax on your income which comes to be: "+tax+"lakhs");

        }
        else if(Income>10.0f) {
            float tax = 30/100.0f*Income;

            System.out.println("You have to pay 30% tax on your income which equals to be: "+tax+"lakhs");
        }
        else {
            System.out.println("You have to pay no tax on your income.");
        }*/

      // solution to problem no.4:

      /* Scanner S = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = S.nextInt();
        switch(a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Your entered key does not refer to any day.\n" +
                    "So you can make it a Funday.");
        }*/

        //Solution to problem no. 5:
       /* Scanner S = new Scanner(System.in);
        int Year = S.nextInt();
        if (Year== 2000) {
            System.out.println("Leap Year");
        }
        else if(Year == (2000 )){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }*/



        //Solution to problem no. 6:

        Scanner S = new Scanner(System.in);
        String Website_Name = S.nextLine();
        if (Website_Name.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if (Website_Name.endsWith(".org")) {
            System.out.println("Organisation Website");
        }
        else if(Website_Name.endsWith(".in")) {
            System.out.println("Indian Website");
        }




    }
}
