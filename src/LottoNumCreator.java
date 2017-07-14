
import java.util.*;

/**
 * 로또번호 생성기
 */
public class LottoNumCreator {

    public void LottoNum() {
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println("Lotto 선택 숫자는");

        int Num = 0;
        while (hashSet.size() < 6) {
            Num= (int)(Math.random()*44)+1;
            hashSet.add(Num);
        }
        List<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("입니다.");
    }
    }


