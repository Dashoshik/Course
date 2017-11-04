package lesson14.employeeTask;

/**
 * Создать класс Report, который будет содержать статический метод generateReport,
 * Используйте форматировании строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 * и можете добавить что-нибудь свое.
 */
public class Report {
    static void generateReport(Employee[] information) {
        for (Employee person : information) {

            System.out.printf("%s %.2f",person.getFullname(),person.getSalary());
            //System.out.println("Сведения о работнике: " + person.getFullname() + ", " + person.getSalary());
        }
    }
}