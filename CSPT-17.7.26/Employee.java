abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double salary = 50000;

    @Override
    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    