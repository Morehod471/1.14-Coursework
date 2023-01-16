public class EmployeeService {

    private Employee[] employees;
    private int size;
    private int totalSalary = 0;
    private int minSalary;
    private Employee employeeWithMinSalary;
    private int maxSalary;
    private Employee employeeWithMaxSalary;
    private int averageSalary;

    public EmployeeService() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String nameSurnamePatronymic, int department, int salary) {
        Employee newEmployee = new Employee(nameSurnamePatronymic, department, salary);
        employees[size++] = newEmployee;
    }

    public void outputEmplyees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public void countTotalSalary() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Зарплата всех сотрудников " + totalSalary);
    }

    public void findMinSalary() {
        minSalary = employees[0].getSalary();
        employeeWithMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Наименьшая зарплата у сотрудник " + employeeWithMinSalary);
    }

    public void findMaxSalary() {
        maxSalary = employees[0].getSalary();
        employeeWithMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Наибольшая зарплата у сотрудник " + employeeWithMaxSalary);
    }

    public void countAverageSalary() {
        averageSalary = totalSalary / size;
        System.out.println("Средняя зарплата всех сотрудников " + averageSalary);
    }

    public void outputEmplyeesName() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getNameSurnamePatronymic());
        }
    }

}
