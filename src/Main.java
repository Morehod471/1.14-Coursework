public class Main {
    public static void main(String[] args){

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

        employeeService.outputEmplyees();
        System.out.println();
        employeeService.countTotalSalary();
        System.out.println();
        employeeService.findMinSalary();
        System.out.println();
        employeeService.findMaxSalary();
        System.out.println();
        employeeService.countAverageSalary();
        System.out.println();
        employeeService.outputEmplyeesName();
    }
}