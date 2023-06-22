package JAVA;

class Employee {
    int empid;
    String empname;
    double salary;

    double updateSalary() {

        return salary = salary + 5000;
    }
}

public class oops_Question_20 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.empid);
        double newsal = e1.updateSalary();
        System.out.println(newsal);
    }

}
