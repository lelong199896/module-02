package Demerging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demerging implements Comparator<Employee> {
    private final List<Employee> NU;
    private final List<Employee> NAM;
    private List<Employee> TONG;

    public Demerging() {
        NU = new ArrayList<>();
        NAM = new ArrayList<>();
        TONG = new ArrayList<>();
    }

    public void add(Employee e) {
        TONG.add(e);
    }

    public void sortByDateOfBirth(List<Employee> list) {
        int noSwap = 0;
        while (noSwap < list.size() - 1) {
            noSwap = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                Employee o1 = list.get(i);
                Employee o2 = list.get(i + 1);
                if (compare(o1, o2) > 0) {
                    Employee temp = list.get(i);
                    list.set(i, o2);
                    list.set(i + 1, temp);
                } else noSwap++;
            }
        }
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getYear() < o2.getYear()) {
            return 1;
        } else if (o1.getYear() > o2.getYear()) {
            return -1;
        } else {
            if (o1.getMonth() > o2.getMonth()) {
                return 1;
            } else if (o1.getMonth() < o2.getMonth()) {
                return -1;
            } else {
                return Integer.compare(o1.getDay(), o2.getDay());
            }
        }
    }


    public void sortByGenderAndBirth() {
        for (Employee e : TONG) {
            if (e.getGender().equals("nu")) {
                NU.add(e);
            } else if (e.getGender().equals("nam")) {
                NAM.add(e);
            }
        }
        sortByDateOfBirth(NU);
        sortByDateOfBirth(NAM);
        TONG.clear();
        TONG.addAll(NU);
        TONG.addAll(NAM);
    }

    public void display() {
        for (Employee e : TONG) {
            System.out.print(e.getName() + "-");
            System.out.print(e.getGender() + "-");
            System.out.println(Arrays.toString(e.getDateOfBirth()));
        }
    }
}
