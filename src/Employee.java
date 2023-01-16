public class Employee {
    private String nameSurnamePatronymic;
    private int department;
    private int salary;
    public static int counter = 0;
    private int id;


    public Employee(String nameSurnamePatronymic, int department, int salary) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.department = department;
        this.salary = salary;
    }

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника " + this.nameSurnamePatronymic + " Отдел " + this.department + " Оклад " + this.salary;
    }
}
