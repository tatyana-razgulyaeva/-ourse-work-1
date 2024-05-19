import java.util.Random;

public class Main {

    private static final Random random = new Random(2);

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.add("Иванов Иван Иванович", 34500.0, 2);
        employeeBook.add("Петров Петр Петрович", 64200.0, 5);
        employeeBook.add("Юрьев Юрий Юрьевич", 55400.0, 3);
        employeeBook.add("Сергеев Сергей Сергеевич", 23900.0, 1);
        employeeBook.add("Романов Роман Романович", 35200.0, 4);
        employeeBook.add("Кириллов Кирилл Кириллович", 41800.0, 3);
        employeeBook.add("Тимофеев Тимофей Тимофеевич", 29100.0, 1);
        employeeBook.add("Константинов Константин Константинович", 75300.0, 5);
        employeeBook.add("Леонидов Леонид Леонидович", 62600.0, 4);
        employeeBook.add("Михайлов Михаил Михайлович", 45670.0, 2);
        employeeBook.printAll();
    }
}




