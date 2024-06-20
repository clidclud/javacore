package hw3.second;

/*Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
кроме руководителей. В основной программе создайте руководителя и
поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и
проследите, чтобы зарплата руководителя не повысилась.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Head("Bob", 150000));
        employees.add(new Employee("Tom", 70000));
        employees.add(new Employee("Rob", 70000));
        employees.add(new Employee("Sam", 70000));

        System.out.println("Before salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Head.salaryIncrease(employees, 0.2);

        System.out.println("After salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}