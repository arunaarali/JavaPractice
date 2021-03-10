import java.util.ArrayList;

public class BasicOpsArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //adding elements to arraylist
        arrayList.add("Ana");
        arrayList.add("David");
        arrayList.add("Smith");

        //System.out.println(arrayList);
        System.out.println("Original Array list:");
        for(String name:arrayList){
            System.out.println(name);
        }

        //adding element to the 2nd index of array list
        System.out.println("Array list after add operation: ");
        arrayList.add("Jessi");
        arrayList.add(1,"Elsa");
        for(String name:arrayList){
            System.out.println(name);
        }

        //Array list size
        int size = arrayList.size();
        System.out.println("Size of an array list: "+size);

        //remove element
        System.out.println("Remove element from array list: ");
        arrayList.remove("David");
        for(String name:arrayList){
            System.out.println(name);
        }

        //remove element from specific index
        System.out.println("Remove element from specific index: ");
        arrayList.remove(2);
        for(String name:arrayList){
            System.out.println(name);
        }

        //change or update array list
        System.out.println("Updated array list: ");
        arrayList.set(1,"Molly");
        for(String name:arrayList){
            System.out.println(name);
        }

        //indexOf operation on array list
        int index = arrayList.indexOf("Jessi");
        System.out.println("Index of specific element: "+index);

        //get operation
        String element=arrayList.get(1);
        System.out.println("element at index 1: "+element);

        //contains operation
        boolean result = arrayList.contains("Caitlin");
        System.out.println("Array list contains name Caitlin? "+result);

        //clear() operation to delete elements of array list in one go
        arrayList.clear();
        System.out.println("Array list is empty after clear() operation: " +arrayList);
    }
}
