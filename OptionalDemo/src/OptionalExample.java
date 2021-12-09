import java.util.Optional;

class Customer{
    private int id;
    private String name;
    private long Salary;
    private String Address;

     public Customer(int id, String name, long salary, String address) {
         this.id = id;
         this.name = name;
         Salary = salary;
         Address = address;
     }

     public Customer() {

     }

     @Override
     public String toString() {
         return "Customer{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", Salary=" + Salary +
                 ", Address='" + Address + '\'' +
                 '}';
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

     public long getSalary() {
         return Salary;
     }

     public void setSalary(long salary) {
         Salary = salary;
     }

     public String getAddress() {
         return Address;
     }

     public void setAddress(String address) {
         Address = address;
     }
 }

public class OptionalExample {
    public static void main(String[] args) {

        Customer customer = new Customer(1,"pawan",10000,null);

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

      /*  Optional<String> emailOptional = Optional.of(customer.getName());
        System.out.println(emailOptional);*/

        Optional<String> nameOptional2 = Optional.ofNullable(customer.getAddress());
        System.out.println(nameOptional2);
        System.out.println(nameOptional2.orElseThrow(()->new IllegalArgumentException("name not present")));

    }

}
