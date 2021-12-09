import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
    public static void main(String[] args) {
        Map<String, Integer> student = new ConcurrentHashMap<>();

        student.put("pawan", 101);
        student.put("ranjith", 103);
        student.put("kusuma", 104);

        Iterator iterator =student.keySet().iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key+" "+student.get(key));
            student.put("adharsh", 109); // failsafeIterator
        }

    }
}
//output
/*pawan 101
  kusuma 104
  ranjith 103*/
