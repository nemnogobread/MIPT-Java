package ru.skillbench.tasks.basics.entity;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee object1 = new EmployeeImpl();
        object1.setFirstName("Ivan");
        object1.setLastName("Ivanov");
        object1.increaseSalary(120);
        System.out.println(object1.getTopManager().getFullName());

        Employee object2 = new EmployeeImpl();
        object2.setFirstName("Gleb");
        object2.setLastName("Miloslavov");
        object1.increaseSalary(90);
        object1.setManager(object2);
        System.out.println(object1.getTopManager().getFullName());
    }
}
