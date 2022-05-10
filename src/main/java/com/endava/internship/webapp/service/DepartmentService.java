package com.endava.internship.webapp.service;

import com.endava.internship.webapp.model.Department;
import com.endava.internship.webapp.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(final Integer id) {
        return departmentRepository.findById(id).
                orElseThrow(() -> new NoSuchElementException("Department not found"));
    }

    public Department saveDepartment(final Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(final Department department,final Integer id) {

        if (departmentRepository.findById(id).isPresent()) {
            Department updatedDepartment = departmentRepository.getById(id);

            updatedDepartment.setName(department.getName());
            updatedDepartment.setLocation(department.getLocation());

            return departmentRepository.save(updatedDepartment);
        } else {
            throw new NoSuchElementException("Department not found");
        }
    }
}
