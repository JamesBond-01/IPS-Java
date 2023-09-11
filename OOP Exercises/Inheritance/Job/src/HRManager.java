import java.util.Scanner;
public class HRManager extends Employee {
    public HRManager() {}
    public HRManager(String name, String surname) {
        setName(name);
        setSurname(surname);
        double salary = 200000;
        setSalary(salary);
    }
    public void addEmployee() {
        System.out.println("Adding a new employee...");
        Employee employee = new Employee();
        Scanner reader = new Scanner(System.in);

        System.out.print("Nombre: ");
        employee.setName(reader.next());
        System.out.print("Apellido: ");
        employee.setSurname(reader.next());
        System.out.print("Salario: ");
        employee.setSalary(reader.nextDouble());

        employee.showEmployee();
    }
    @Override
    public void work() {
        addEmployee();
    }
}
