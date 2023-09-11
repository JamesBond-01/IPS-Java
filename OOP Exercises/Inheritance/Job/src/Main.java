public class Main {
    public static void main(String[] args) {
        HRManager hrManager1 = new HRManager("Leandro" , "Gomez");
        Employee employee1 = new Employee("Lucas", "Solhaune", 150000);

        employee1.showEmployee();
        employee1.work();
        hrManager1.showEmployee();
        hrManager1.work();

    }
}