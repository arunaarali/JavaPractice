import java.util.*;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Name","Aaryan");
        myHashMap.put("LName","Palled");
        myHashMap.put("name","Mahesh");
        myHashMap.put("lName","Palled");
        myHashMap.put("Name","Aruna");
        myHashMap.put("LName","Arali");
        myHashMap.put("Name","Aaryan");
        myHashMap.put("LName","Palled");
        System.out.println(myHashMap.replace("Name","Aaryan","Aruna"));
        System.out.println(myHashMap);

//        Set<Map.Entry<String, String>> mySet = myHashMap.entrySet();
//        Iterator it = mySet.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }



        List<String> d = new ArrayList<>(myHashMap.values());
        System.out.println(d);

        System.out.println("****** HashTable ******");
        Hashtable<String, String> myTable = new Hashtable<>();
        myTable.put("Name","Mahesh");
        myTable.put("Place", "Bellevue");
        System.out.println(myTable);

    }
}
