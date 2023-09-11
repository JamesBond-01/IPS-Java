public class Employee {
    private String name;
    private String surname;
    private double salary;
    public Employee() {}
    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("Working as an employee.");
    }
    public void showEmployee() {
        System.out.println(name + " " + surname + " - $" + salary);
    }
}
