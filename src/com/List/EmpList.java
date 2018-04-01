package com.List;

import java.util.ArrayList;
import java.util.List;

public class EmpList {

    public static void main(String args[])
    {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Sangha", "Davane", 101));
        empList.add(new Employee("Rangha", "Tavane", 101));
        empList.add(new Employee("Tarangha", "Tavane", 101));
        empList.add(new Employee("Maligha", "Ravane", 101));
        empList.add(new Employee("Sgha", "Lvane", 101));

        empList.forEach(emp ->System.out.println(emp));

        System.out.println(empList.get(3));
        System.out.println(empList.isEmpty());

        empList.set(1, new Employee("Pallavi", "Jondhal", 108));

        empList.forEach(emp ->System.out.println(emp));

        System.out.println(empList.contains( new Employee("Pallavi", "Jondhal", 108)));

    }
}
