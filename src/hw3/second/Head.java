package hw3.second;

import java.util.ArrayList;

public class Head extends Employee{

    public Head(String name, double salary) {
        super(name, salary);
    }

    public static void salaryIncrease(ArrayList<Employee> employees, double increase){
        for(Employee e : employees){
            if (!(e instanceof Head)) {
                e.increaseSalary(increase);
            }
        }
    }
}