package Base;

import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private double salary;
    public static int count = 1;
    private Integer id = 1;
    public Employee() {
        count++;
    }
    public Employee(String name, String department, double salary, Integer id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}

