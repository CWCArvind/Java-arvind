import java.util.*;

public class myHashSet extends HashSet {
    public static void main(String[] args) {

        HashSet<Integer> Hash1 = new HashSet<>(10,0.9f);

        Hash1.add(22);
        Hash1.add(31);
        Hash1.add(54);
        Hash1.add(78);
        Hash1.add(11);
        Hash1.add(39);

        System.out.println(Hash1);

    }
}
