/**
 * 성적나누기
 */
public class StudentsGrade {
    public void StudentsGrade(int a) {
        a = a;
        if ( a <= 30 ) {
            System.out.println ( "F" );
        } else if ( a <= 60 )  {
            System.out.println ( "C" );
        } else if ( a <= 80 ) {
            System.out.println ( "B" );
        } else {
            System.out.println ( "A" );
        }
    }
}
