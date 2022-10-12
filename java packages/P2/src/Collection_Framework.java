import java.util.*;

class myArrayList extends ArrayList {

    public void ArrayOfNames (){
        ArrayList<String> names = new ArrayList<>(3);
        names.add("Tarun");
        names.add("Rajat");
        names.add(0,"Utkarsh");
        System.out.print("Student Names: ");
        System.out.println(names);
    }
}

class myLinkedList extends LinkedList{
    public void ListOfMarks (){
        LinkedList<Integer> marks = new LinkedList<>();
        marks.add(464);
        marks.add(458);
        marks.add(456);
        System.out.print("Students total marks correspondingly: ");
        System.out.println(marks);
    }
}
class myArrayDeque extends ArrayDeque {
    public void ArrayOfMathsMarks (){
        ArrayDeque<Integer> matmarks = new ArrayDeque<>(3);
        matmarks.add(94);
        matmarks.add(84);
        matmarks.add(78);
        System.out.print("Marks of Mathematics correspondingly: ");
        System.out.println(matmarks);
    }
}

class myHashSet extends HashSet {
    public void SetOfScienceMarks (){
        HashSet<Integer> scimarks = new HashSet<>(3);
        scimarks.add(87);
        scimarks.add(85);
        scimarks.add(76);
        System.out.print("Marks of Science correspondingly: ");
        System.out.println(scimarks);
    }
}



public class Collection_Framework  {
    public static void main(String[] args) {

        // Collection Framework: It helps us in better manipulating of data and to store data

        // ArrayList: - provides a special support in building array and manipulating it.
        // LinkedList: - provides faster addition and removal of data from a long array in addition to the ArrayList Methods and functioning.
        // ArrayDeque: - It helps us to remove and add data from both the ends that's why we call it a double ended array.
        // Hashing: - It is used to faster searching and manipulation of data in an array.
        // 1) HashSet 2) HashMap These are the two classes which support hashing and implements it .
        // Syntax of all is approximately same.

        myArrayList l1 = new myArrayList();
        myLinkedList l2 = new myLinkedList();
        myArrayDeque l3 = new myArrayDeque();
        myHashSet l4 = new myHashSet();

        l1.ArrayOfNames();
        l2.ListOfMarks();
        l3.ArrayOfMathsMarks();
        l4.SetOfScienceMarks();

    }
}
