import java.util.Scanner;

class maxRetriesException extends Exception{
    @Override
    public String toString() {
        return "ERRor";
    }
}


public class Error_Practice {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int [] marks = {2,5,6,9};
        boolean flag = true;
        int i = 1;
        while (flag) {

            i++;
            if (i==7){
                try {
                    throw new maxRetriesException();
                }
                catch (maxRetriesException e){
                    System.out.println(e);
                }
            }

            try{
                System.out.println("Enter the index number: ");
            int index = S.nextInt();
            System.out.println(marks[index]);
            break;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("You have entered a wrong index number\nPlease try again");
            }
        }

    }
}
