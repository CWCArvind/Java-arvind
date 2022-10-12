
import java.util.Scanner;
interface morning {
    void greet ();
}
class goodMorning implements morning{
    public void greet (){
        System.out.println("Hey man, Good Morning");
    }
}

public class Sorting_String_Array {
    public static void ImplementedInterfaceNames(goodMorning good) {
    };
    public static void main(String[] args) {

        goodMorning good = new goodMorning();



        ImplementedInterfaceNames(good);
        Scanner S = new Scanner(System.in);

        String [] names = new String[5];
        for(int i =0;i<names.length;i++){
            String name = S.nextLine();
            names[i] = name;
        }
        int n = names.length;

        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(names[i].compareToIgnoreCase(names[j])>0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }




            }
        }
        for(String elements : names){
            System.out.println(elements);
        }



//        String [] names = {"John","Remo","Mixy","Julie","Ronny"};
//        for(String name:names){
//            System.out.println(name);
//        }
//       int n = names.length;
//
//        for(int i =0;i<(n-1);++i){
//            for(int j=i+1;j<n;++j){
//               if( names[i].compareTo(names[j])>0){
//                   String temp = names[i];
//                   names[i] = names[j];
//                   names[j] = temp;
//               }
//            }
//        }
//        System.out.println();
//       for(int i = 0; i < n; i++) {
//           System.out.println(names[i]);
//       }


    }


}

