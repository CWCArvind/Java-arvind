import java.util.*;


public class Collections_Frameworks extends ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        Collections_Frameworks obj = new Collections_Frameworks();

        l2.add(11);
        l2.add(13);
        l2.add(17);
        l2.add(19);
        l2.add(23);

        //l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(11);
        l1.add(0,2);
        l1.ensureCapacity(10);


        l1.addAll(l2);
//        l1.remove(4);
         l1.set(6,11);
         System.out.println(l1.size());
        System.out.println(l1.clone());
//        System.out.println(l1.contains(5));
//        System.out.println(l2.isEmpty());
//        //l1.removeAll(l2);
       // l1.removeAll(l2);
        //l1.retainAll(l2);





        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i)+", ");
        }
        System.out.println();
        System.out.println(l1.indexOf(11));
        System.out.println(l1.lastIndexOf(11));
        System.out.println(l1.subList(4,7));
        System.out.println(Arrays.toString(l1.toArray()));
        l1.trimToSize();

    }
}
