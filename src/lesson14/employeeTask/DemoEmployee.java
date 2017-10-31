package lesson14.employeeTask;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee salesManager = new Employee("Ivanov", 15000);
        Employee accountant = new Employee("Kovalenko", 12000);
        Employee worker = new Employee("Petrov", 8000);
        Employee[] information = {salesManager, accountant, worker};
        Report.generateReport(information);

    }
}
