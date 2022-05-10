package com.endava.internship.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "department_id")
    @GeneratedValue(generator = "departments_seq")
    @SequenceGenerator(name = "departments_seq", sequenceName = "DEPARTMENTS_SEQ", allocationSize = 1)
    private int departmentId;

    @Column
    private String name;

    @Column
    private String location;
}
