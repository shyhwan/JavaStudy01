import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        try {

            SimpleDateFormat date = new SimpleDateFormat("yyyymmdd");
            Student student = new Student();
            Student st1 = new Student("abc", 11, "oneday", "male", (Date) date.parse("20130301"));
            Student st2 = new Student("def", 12, "dDay", "female", (Date) date.parse("20120222"));
            Student st3 = new Student("efg", 13, "oneday", "male", (Date) date.parse("20111212"));
            Student st4 = new Student("hij", 31, "dDay", "female", (Date) date.parse("19931111"));
            Student st5 = new Student("klm", 41, "dDay", "male", (Date) date.parse("19830808"));
            Student st6 = new Student("가나다", 33, "oneday", "male", (Date) date.parse("19910310"));
            Student st7 = new Student("라마바", 55, "dDay", "female", (Date) date.parse("19691201"));
            Student st8 = new Student("사아자", 72, "dDay", "female", (Date) date.parse("19521101"));
            Student st9 = new Student("차카타", 2, "oneday", "female", (Date) date.parse("20220728"));
            
            List<String> list = new ArrayList<>();
            
            list.add("abc");
            list.add("null");
            list.add("undefind");
            list.add("false");
            
            Stream<String> stream = list.stream();
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {

        }
            
        }
    }
