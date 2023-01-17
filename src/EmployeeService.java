public class EmployeeService {

    private static Employee[] employees;
    private int size;
    private int totalSalary = 0;
    private int minDepSalary = 1_000_000;
    private Employee employeeOfDepWithLowestSalary;
    private int maxDepSalary = 0;
    private Employee employeeOfDepWithHighestSalary;

    public EmployeeService() {
        employees = new Employee[10];
    }

    public void addEmployee(String nameSurnamePatronymic, int department, int salary) {
        Employee newEmployee = new Employee(nameSurnamePatronymic, department, salary);
        employees[size++] = newEmployee;

    }

    public void outputEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void countTotalSalary() {
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Зарплата всех сотрудников " + totalSalary);
    }

    public void findMinSalary() {
        int minSalary = employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Наименьшая зарплата у " + employeeWithMinSalary);
    }

    public void findMaxSalary() {
        int maxSalary = employees[0].getSalary();
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Наибольшая зарплата у " + employeeWithMaxSalary);
    }

    public void countAverageSalary() {
        int averageSalary = totalSalary / size;
        System.out.println("Средняя зарплата всех сотрудников " + averageSalary);
    }

    public void outputEmployeesName() {
        for (Employee employee : employees) {
            System.out.println(employee.getNameSurnamePatronymic());
        }
    }

    public void indexingSalary(int index) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (100 + index) / 100);
        }
    }

    public void findDepLowestSalary(int depNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                if (minDepSalary > employee.getSalary()) {
                    minDepSalary = employee.getSalary();
                    employeeOfDepWithLowestSalary = employee;
                }
            }
        }
        System.out.println("Наименьшая зарплата в отделе " + depNumber + " у " + employeeOfDepWithLowestSalary);

    }

    public void findDepHighestSalary(int depNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == depNumber) {
                if (maxDepSalary < employee.getSalary()) {
                    maxDepSalary = employee.getSalary();
                    employeeOfDepWithHighestSalary = employee;
                }
            }
        }
        System.out.println("Наименьшая зарплата в отделе " + depNumber + " у " + employeeOfDepWithHighestSalary);

    }

}
