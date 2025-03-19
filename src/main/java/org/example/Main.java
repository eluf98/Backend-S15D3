package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList= new LinkedList<>();
        employeeList.add(new Employee(100, "Elif", "Gundogan"));
        employeeList.add(new Employee(101, "Koray", "Gundogan"));
        employeeList.add(new Employee(101, "Koray", "Gundogan"));
    }
    // removeDuplicates: Tekrar eden employee'leri listeden siler, sadece bir kez geçenleri döner
    public static List<Employee> removeDuplicates(List<Employee> employeeList) {
        List<Employee> uniqueList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee != null && Collections.frequency(employeeList, employee) == 1) {
                uniqueList.add(employee);
            }
        }

        return uniqueList;
    }

    // findUniques: Tekrar etmeyen employee'leri bir Map'e ekler, her id için bir employee
    public static Map<Integer, Employee> findUniques(List<Employee> employeeList) {
        Map<Integer, Employee> uniques = new HashMap<>();

        for (Employee employee : employeeList) {
            if (employee != null && !uniques.containsKey(employee.getId())) {
                uniques.put(employee.getId(), employee);
            }
        }

        return uniques;
    }

    // findDuplicates: Tekrar eden employee'leri bulur ve bir listeye ekler
    public static List<Employee> findDuplicates(List<Employee> employeeList) {
        List<Employee> duplicates = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee != null && Collections.frequency(employeeList, employee) > 1 && !duplicates.contains(employee)) {
                duplicates.add(employee);
            }
        }

        return duplicates;
    }
}