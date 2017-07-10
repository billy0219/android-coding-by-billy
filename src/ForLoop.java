import java.util.ArrayList;
import java.util.Arrays;

/**
 * for-loop
 * - original
 * - for-each
 * while
 */
public class ForLoop {
    public void explainForLoop() {
        String[] strings = {
                "Hello", "this", "is", "Billy",
                "Hello", "this", "is", "Billy",
                "Hello", "this", "is", "Billy",
                "Hello", "this", "is", "Billy"
        };
        //   System.out.println("Hello");
        //   System.out.println("This");
        //   System.out.println("is");
        //   System.out.println("Billy");

        //   ++operator
        //   int testIn = 3;
        //   testIn = testIn + 1;
        //    testIn++;
        //   System.out.println(testIn);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public void explainForLoopWithArrayList() {
        String[] strings = {"Hello", "this", "is", "Billy"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (String targetString: arrayList) {
            System.out.println(targetString);
        }
    }
}