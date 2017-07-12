/**
 * 다이아몬드 만들기
 */
public class Diamond {
    public void diamonds () {
        String[] strings = {
                "00100","01110","11111","01110","00100",
        };

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
