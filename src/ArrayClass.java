import java.util.Arrays;

public class ArrayClass {
     int test =10;
    public static void main(String[] args) {
        int[] myArray = new int[10];//
        int[] secArr   = {1,2,3,4};//
        int[] thirdArray;//

        System.out.println(secArr);
        System.out.println(secArr.toString());
        System.out.println(secArr.hashCode());
        System.out.println(Arrays.toString(secArr));

        thirdArray = secArr;
        System.out.println("********");
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(thirdArray.hashCode());

        ArrayClass a = new ArrayClass();
        System.out.println(thirdArray.length);
    }
}
