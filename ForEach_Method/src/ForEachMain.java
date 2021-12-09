import java.util.ArrayList;
import java.util.List;

class Person{
    private int id;
    private String name;
    private String address;

    public Person() {

    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


public class ForEachMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1,"pawan","Hyd"));
        list.add(new Person(2, "kartik", "chennai"));
        list.add(new Person(3,"ranjith","banglore"));

        for(Person person: list){
            System.out.println(person.getId()+" "+person.getName()+ " "+ person.getAddress());
 }
        list.forEach((person ->{
            System.out.println(person.getId()+ " "+ person.getName()+" "+person.getAddress());
        }
                ));

    }
}
