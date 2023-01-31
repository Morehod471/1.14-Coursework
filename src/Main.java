public class Main {
    public static void main(String[] args){

        int index = 15;
        int depNumber = 1;
        int salaryLowLimit = 15000;
        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployee("Alex", 2, 12000);
        employeeService.addEmployee("Sarah", 1, 15000);
        employeeService.addEmployee("Ken", 3, 30000);
        employeeService.addEmployee("Bill", 4, 45000);
        employeeService.addEmployee("Jill", 1, 9000);
        employeeService.addEmployee("Kevin", 5, 29000);
        employeeService.addEmployee("John", 2, 16000);
        employeeService.addEmployee("Sonia", 3, 27000);
        employeeService.addEmployee("Ivan", 4, 30000);
        employeeService.addEmployee("Pavel", 2, 60000);

        //employeeService.indexingSalary(index);
        employeeService.outputEmployees();
        System.out.println();
        employeeService.countTotalSalary();
        System.out.println();

        employeeService.findMinSalary();
        System.out.println();
        employeeService.findMaxSalary();
        System.out.println();
        employeeService.countAverageSalary();
        System.out.println();
        employeeService.outputEmployeesName();
        System.out.println();
        employeeService.findDepLowestSalary(depNumber);
        System.out.println();
        employeeService.findDepHighestSalary(depNumber);
        System.out.println();
        employeeService.countTotalDepSalary(depNumber);
        System.out.println();
        employeeService.countAverageDepSalary(depNumber);
        System.out.println();
        employeeService.outputEmployeesWithSalaryLess(salaryLowLimit);
        System.out.println();

    }
}