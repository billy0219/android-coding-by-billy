import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Array
 * ArrayList
 * HashSet
 * HashMap
 */
public class CollectionFrameworks {
    public void explainArray(){
        int[] intArray = new int[5];
        // double[] doubleArray = new double[5];

        intArray[0] = 5;
        System.out.println(intArray[0]); // 1
        System.out.println(intArray[1]); // 2
        System.out.println(intArray[2]); // 3
        System.out.println(intArray[3]); // 4
        System.out.println(intArray[4]); // 5
    }

    public void explainArrayList() {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        }
    public void explainHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("hello");

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("hello"));
        System.out.println(hashSet.contains("Billy"));
        // System.out.println(hashSet.get("Billy"));


        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println(arrayList.get(0));
        }
    public void explainHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","Billy");
        System.out.println(hashMap.get("name"));
    }
}
