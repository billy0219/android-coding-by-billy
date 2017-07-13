import java.util.HashSet;

/**
 * 로또번호 생성기
 */
public class LottoNumCreator {

    public void LottoNum() {
        HashSet<Integer> hashSet = new HashSet<>();
        Integer[] LottoNum = new Integer[6];

            System.out.println("Lotto 선택 숫자는");

        for ( Integer i = 0; i < LottoNum.length; i++ ) {
            LottoNum[i] = (int) (Math.random() * 44) + 1;

            System.out.println(LottoNum[i]);

        }

            System.out.println( "입니다.");


    }

}
