package ru.skillbench.tasks.basics.entity;

import ru.skillbench.tasks.basics.entity.Employee;

public class EmployeeImpl implements Employee {
    private String FirstName;
    private String LastName;
    private int salary;
    private Employee manager;

    public EmployeeImpl() {
        this.salary = 1000;
        manager = null;
    }


    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void increaseSalary(int value) {
        this.salary += value;
    }

    @Override
    public String getFirstName() {
        return this.FirstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.LastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    @Override
    public String getFullName() {
        return this.FirstName + " " + this.LastName;
    }

    @Override
    public void setManager(Employee manager) {

        this.manager = manager;
    }

    @Override
    public String getManagerName() {
        if (this.manager == null)
            return  "No manager";
        return this.manager.getFirstName() + " " + this.manager.getLastName();
    }

    @Override
    public Employee getTopManager() {
        if (this.manager == null)
            return this;
        return this.manager.getTopManager();
    }
}
