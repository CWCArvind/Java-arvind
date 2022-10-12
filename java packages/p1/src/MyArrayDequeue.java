import java.util.*;

public class MyArrayDequeue extends ArrayDeque{
    public static void main(String[] args) {

        ArrayDeque<Integer> D1 = new ArrayDeque<>(6);


        D1.add(5);
        D1.add(7);
        D1.add(11);
        D1.add(13);
        D1.add(17);

        D1.addFirst(3);
        D1.addFirst(2);
        System.out.println(D1.size());

        System.out.println(D1.getFirst());
        System.out.println(D1.peekFirst());

        System.out.println(D1.getLast());
        System.out.println(D1.peekLast());





    }
}
