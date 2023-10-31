package Demerging;

import java.util.Scanner;

public class DemergingMain {
    public static void main(String[] args) {
        Employee el1 = new Employee("A", "nam", 2, 1, 2000);
        Employee el2 = new Employee("B", "nu", 3, 11, 2001);
        Employee el3 = new Employee("C", "nu", 15, 5, 1995);
        Employee el4 = new Employee("D", "nam", 20, 4, 2015);
        Employee el5 = new Employee("E", "nam", 7, 8, 1998);

        Demerging list = new Demerging();
        list.add(el1);
        list.add(el2);
        list.add(el3);
        list.add(el4);
        list.add(el5);

        list.sortByGenderAndBirth();
        list.display();
    }
}