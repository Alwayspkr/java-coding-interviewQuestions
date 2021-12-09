import java.util.ArrayList;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        final List<String> customers = new ArrayList<>();
        customers.add("Pawan");
        customers.add("Ranjith");
        customers.add("Navven");
        System.out.println(customers);

    //    customers = new ArrayList<>(); cannot modified

        List<Integer> customers1 = new ArrayList<>();
        customers1.add(1);
        customers1.add(2);
        customers1.add(3);
        System.out.println(customers1);

        customers1 = new ArrayList<>();
        customers1.add(3);
        System.out.println(customers1);


    }
}
