package com.gautamthapa.java8.stream;

import com.gautamthapa.util.Employee;
import com.gautamthapa.util.Util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {
    static void main() {
        List<Employee> employees = Util.getEmployees();

        Map<String, List<Employee>> employeeGroupingByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees grouped by department:");
        employeeGroupingByDepartment.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
