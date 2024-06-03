package com.project.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee employee = new Employee();
        employee.setDni(UUID.randomUUID().toString());
        employee.setName("Jorge");
        employee.setSalary(10000.0);

        return employee;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
