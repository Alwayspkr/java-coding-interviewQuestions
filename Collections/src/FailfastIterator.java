import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailfastIterator {
    public static void main(String[] args) {

        List<String> student = new ArrayList<>();

        student.add("pawan");
        student.add("Ranjith");
        student.add("kusuma");

        Iterator<String> iterator = student.iterator();

        while(iterator.hasNext()){
            String elements=iterator.next();
            System.out.println(elements);
            student.add("mom");   // ConcurrentModificationException
        }
    }
}

//output
/*pawan
        Exception in thread "main" java.util.ConcurrentModificationException
        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
        at java.util.ArrayList$Itr.next(ArrayList.java:861)
        at FailfastIterator.main(FailfastIterator.java:17)*/
