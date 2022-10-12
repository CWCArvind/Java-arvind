import java.util.*;

public class MyLinkedlist extends LinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(45);
        list1.add(46);
        list1.add(47);
        list1.add(48);
        list1.add(49);
        list1.addLast(53);
        list1.addFirst(43);
        System.out.println(list1.contains(53));


        list1.add(1,44);
        list1.add(7,50);
        list1.add(8,51);
        list1.add(9,52);

        list1.remove(1);
        list1.remove(2);
        list1.remove(3);
        list1.remove(4);
        list1.remove(5);


        for (int i =0;i<list1.size();i++){
            System.out.print(list1.get(i));
            System.out.print(", ");
        }


    }
}
