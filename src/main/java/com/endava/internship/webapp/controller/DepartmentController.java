package com.endava.internship.webapp.controller;

import com.endava.internship.webapp.model.Department;
import com.endava.internship.webapp.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{department_id}")
    public Department getDepartmentById(@PathVariable("department_id") final Integer id) {
        return departmentService.getDepartmentById(id);
    }

    @PostMapping
    public Department saveDepartment(@RequestBody final Department department) {
        return departmentService.saveDepartment(department);
    }

    @PutMapping("/{department_id}")
    public Department updateDepartmentById(@RequestBody final Department department, @PathVariable("department_id") final Integer id) {
        return departmentService.updateDepartment(department, id);
    }
}
