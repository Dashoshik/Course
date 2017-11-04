package lesson14.employeeTask;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report, который будет содержать статический метод generateReport,
 * в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматировании строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 * и можете добавить что-нибудь свое.
 */

public class Employee {
    private String fullname;
    private float salary;

    public Employee(String fullname, float salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public float getSalary() {
        return salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Float.compare(employee.salary, salary) != 0) return false;
        return fullname != null ? fullname.equals(employee.fullname) : employee.fullname == null;
    }

    @Override
    public int hashCode() {
        int result = fullname != null ? fullname.hashCode() : 0;
        result = 31 * result + (salary != +0.0f ? Float.floatToIntBits(salary) : 0);
        return result;
    }
}
