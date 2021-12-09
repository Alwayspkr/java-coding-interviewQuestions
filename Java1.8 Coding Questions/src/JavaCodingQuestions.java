import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaCodingQuestions {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

createEmployeeList(employeeList);
        //programm to print max/min salary from the given employee salary:
        Optional<Employee> highestEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator
                        .comparingDouble(Employee::getSalary)));
        System.out.println(highestEmployee);

        Optional<Employee> lowestEmployee = employeeList.stream()
                .collect(Collectors.minBy(Comparator
                        .comparingDouble(Employee::getSalary)));
        System.out.println(lowestEmployee);


    }



    private static void createEmployeeList(List<Employee> employeeList){

        employeeList.add(new Employee(111,"Pawan",25,"yes","Developer", 2021,60000));
        employeeList.add(new Employee(112,"Ranjith",28,"no","Tester", 2019,65000));
        employeeList.add(new Employee(113,"Bharath",32,"yes","frontend", 2018,70000));
        employeeList.add(new Employee(114,"Manohar",35,"yes","Backend", 2021,66000));
        employeeList.add(new Employee(115,"Vamshi",32,"no","Manager", 2021,70000));
        employeeList.add(new Employee(116,"Naveen",18,"no","Database", 2021,80000));
        employeeList.add(new Employee(117,"Kumar",19,"no","Angular", 2017,69000));
        employeeList.add(new Employee(118,"Ajay",25,"yes","Spring", 2020,67000));
        employeeList.add(new Employee(119,"SriRam",25,"yes","Developer", 2020,90000));
        employeeList.add(new Employee(120,"Suresh",40,"yes","Developer", 2016,90000));
        employeeList.add(new Employee(121,"Mani",12,"yes","Developer", 2021,60000));

    }

}
