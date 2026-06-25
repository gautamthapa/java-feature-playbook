package com.gautamthapa.java8.stream;

import com.gautamthapa.util.Employee;
import com.gautamthapa.util.Util;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalary {
    static void main() {
        System.out.println("Employee with highest salary:");
        List<Employee> employees = Util.getEmployees();
        Employee employee= employees.stream()
                .max(Comparator.comparing(Employee::getSalary)).stream().findFirst().orElse(null);

        System.out.println(employee);
    }
}
