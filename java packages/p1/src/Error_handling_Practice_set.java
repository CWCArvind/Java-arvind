import java.util.Scanner;


class myError_handling_class extends Exception {
    @Override
    public String toString() {
        return "You are continuously entering a index number which does not exist.";
    }
}

class customException {
    public  void arrayIndex () throws myError_handling_class {
        Scanner S = new Scanner(System.in);
        int [] marks = {1,2,8,5,7};
        for(int a = 1; a<=6;a++) {
            if (a==3){
                try {
                    throw new myError_handling_class();
                }
                catch (myError_handling_class e){
                    System.out.println(e);
                    break;
                }
            }
            else {
                System.out.println("Enter the index number");
                try {
                    int index = S.nextInt();
                    System.out.println(marks[index]);
                } catch (Exception e) {
                    System.out.println("Wrong Index , Enter it again");
                }
                if (a == 5) {
                    try {
                        throw new myError_handling_class();
                    } catch (myError_handling_class e) {
                        System.out.println(e.toString());
                        break;
                    }
                }
            }

        }
    }
}


public class Error_handling_Practice_set {
    public static void main(String[] args) {

        customException obj = new customException();

        try {
            obj.arrayIndex();
        }
        catch (myError_handling_class e){
            System.out.println(e);
        }


//        int [] marks = {1,2,8,5,7};
//        for(int a = 1; a<=5;a++) {
//            System.out.println("Enter the index number");
//            try {
//                int index = S.nextInt();
//                int i = marks[index];
//                System.out.println("This is the value at your enter index "+i);
//                break;
//            } catch (Exception e) {
//                System.out.println("You have entered a wrong index...");
//            }
//        }





        }
    }

