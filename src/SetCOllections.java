import java.util.*;

public class SetCOllections {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(29);
        myList.add(11);
        myList.add(32);
        myList.add(22);
        myList.add(14);
        Set<Integer> mySet = new HashSet<>();// No order in data store.
        mySet.add(10);
        mySet.add(29);
        mySet.add(11);
        mySet.add(32);
        mySet.add(22);
        mySet.add(14);
        System.out.println(" **********  HashSet   **********");
        System.out.println(mySet);
        System.out.println(" **********  TreeSet   **********");
        Set<Integer> myTreeSet = new TreeSet<>(myList);
        System.out.println(myTreeSet);
        System.out.println(" **********  LinkedHashSet   **********");
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>(myList);
        System.out.println(myLinkedHashSet);
        System.out.println(" **********  Set validation methods   **********");
        Iterator it = mySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println( mySet);

    }
}
