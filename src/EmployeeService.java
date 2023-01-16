public class EmployeeService {

    private Employee[] employees;
    private int size;

    public EmployeeService() {
        this.employees = new Employee[10];

    }

    public void outputEmplyees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }
}
