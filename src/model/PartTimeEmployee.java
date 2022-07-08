package model;

public class PartTimeEmployee extends Employee {
    private int timeWorking;

    public PartTimeEmployee(int id, String name, int age, String gender, String phone, String email, boolean status, int salary, int timeWorking) {
        super(id, name, age, gender, phone, email, status, salary);
        this.timeWorking = timeWorking;
    }

    public int getTimeWorking() {
        return timeWorking;
    }

    public void setTimeWorking(int timeWorking) {
        this.timeWorking = timeWorking;
    }

    @Override
    public double totalSalary() {
        return this.getSalary() * this.timeWorking;
    }
    @Override
    public String toString() {
        return "PartTimeEmployee{" + super.toString()+ '}';
    }
}
