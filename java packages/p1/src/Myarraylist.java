import java.util.*;


public class Myarraylist extends ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(3);
        names.add("Yash Sharma");
        names.add("Bhuvnesh Sharma");
        names.add("Arvind Sharma");
        names.ensureCapacity(5);
        names.add(0,"Lokesh Sharma");
        names.add(1,"Anju Sharma");
        System.out.println(names.size());
        System.out.println(names.clone());
//        System.out.println(names.toArray());
        for (int a =0;a<names.size();a++){
            System.out.print(names.get(a));
            if(a< names.size()-1) {
                System.out.print(", ");
            }

        }




    }
}
