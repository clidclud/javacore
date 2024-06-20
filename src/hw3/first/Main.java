package hw3.first;

/*    Написать прототип компаратора - метод внутри класса сотрудника,
    сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
    без использования условного оператора.*/

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.compareDates(2020, 1, 1, 2000, 1, 1);
        employee.compareDates(2000, 12, 31, 2000, 1, 1);
    }
}
