package com.gautamthapa.java8.stream;

import com.gautamthapa.util.Employee;
import com.gautamthapa.util.Util;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    static void main() {
        List<Employee> employees = Util.getEmployees();
        Map<Long, String> map = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getFirstName));

        System.out.println("Map " + map);

        // if duplicate keys are possible then it throw exception, for this handle this way
        Map<Long, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity(), (existing, replacement) -> existing));

        System.out.println("Employee Map " + employeeMap);
    }
}
