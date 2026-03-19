package com.gautamthapa.java8.stream;

import com.gautamthapa.util.Employee;
import com.gautamthapa.util.Util;

import java.util.Comparator;
import java.util.List;

public class CustomObjectSort {
    static void main() {
        List<Employee> employees = Util.getEmployees();

        // Ascending
        List<Employee> sortedEmployeeBySalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println("Employees sorted by salary:");
        sortedEmployeeBySalary.forEach(System.out::println);


        // Descending
        List<Employee> sortedEmployeeBySalaryDesc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("\nEmployees sorted by salary (descending):");
        sortedEmployeeBySalaryDesc.forEach(System.out::println);


        // Sort using multiple fields
        List<Employee> sortMultipleFields = employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary)
                        .thenComparing(Employee::getFirstName)
                ).toList();
        System.out.println("\nEmployees sorted by department, then salary, then first name:");
        sortMultipleFields.forEach(System.out::println);
    }
}
