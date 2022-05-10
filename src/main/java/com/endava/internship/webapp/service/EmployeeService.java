package com.endava.internship.webapp.service;

import com.endava.internship.webapp.model.Employee;
import com.endava.internship.webapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(final Integer id) {
        return employeeRepository.findById(id).
                orElseThrow(() -> new NoSuchElementException("Employee not found"));
    }

    public Employee saveEmployee(final Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(final Employee employee,final Integer id) {

        if (employeeRepository.findById(id).isPresent()) {
            Employee updatedEmployee = employeeRepository.getById(id);

            updatedEmployee.setFirstName(employee.getFirstName());
            updatedEmployee.setLastName(employee.getLastName());
            updatedEmployee.setEmail(employee.getEmail());
            updatedEmployee.setPhoneNumber(employee.getPhoneNumber());
            updatedEmployee.setSalary(employee.getSalary());
            updatedEmployee.setDepartment(employee.getDepartment());

            return employeeRepository.save(updatedEmployee);
        } else {
            throw new NoSuchElementException("Employee not found");
        }
    }

}
