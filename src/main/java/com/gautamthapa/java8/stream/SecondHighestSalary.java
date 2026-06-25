package com.gautamthapa.java8.stream;

import com.gautamthapa.util.Employee;
import com.gautamthapa.util.Util;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    static void main() {
        List<Employee> employees = Util.getEmployees();
        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().orElse(null);

        System.out.println(employee);
    }
}
