import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

        Set<Map.Entry<String, String>> mySet = myHashMap.entrySet();
//        Iterator it = mySet.iterator();
        while (mySet.iterator().hasNext()){
            System.out.println(mySet.);
        }



    }
}
