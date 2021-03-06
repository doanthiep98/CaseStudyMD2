package model;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, int age, String gender, String phone, String email, boolean status, int salary) {
        super(id, name, age, gender, phone, email, status, salary);
    }

    @Override
    public double totalSalary() {
        return this.getSalary() * 10;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + super.toString()+ '}';
    }
}
