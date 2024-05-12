public class Main {
    public static void main(String[] args) {
        Integer id1 = new Integer(1);
        Integer id2 = new Integer(2);
        Integer id3 = new Integer(3);
        String name1 = new String("Иванов Иван Иванович");
        String name2 = new String("Петров Петр Петрович");
        String name3 = new String("Сергеев Сергей Сергеевич");
        department1.setDepartment(1);
        department2.setDepartment(2);
        department3.setDepartment(3);
        double salary1 = new Double(35800);
        double salary2 = new Double(58200);
        double salary3 = new Double(71400);

        System.out.println(id1 + ". " + name1 + ", " + department1 + ", " + salary1 + " рублей ");
        System.out.println(id2 + ". " + name2 + ", " + department2 + ", " + salary2 + " рублей ");
        System.out.println(id3 + ". " + name3 + ", " + department3 + ", " + salary3 + " рублей ");

        System.out.println("Сумма затрат на ЗП в месяц " + (salary1 + salary2 + salary3) + " рублей");
        System.out.println("Средняя ЗП в месяц " + (salary1 + salary2 + salary3) / 3 + " рублей");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

}