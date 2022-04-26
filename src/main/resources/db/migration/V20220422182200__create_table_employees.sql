CREATE TABLE employees
(
    employee_id    NUMBER(6)    PRIMARY KEY,
    first_name     VARCHAR2(20) NOT NULL,
    last_name      VARCHAR2(25) NOT NULL,
    email          VARCHAR2(25) UNIQUE NOT NULL,
    phone_number   VARCHAR2(20) UNIQUE NOT NULL,
    salary         NUMBER(8, 2) CHECK (salary > 1.0),
    department_id  NUMBER(4)    NOT NULL,
    CONSTRAINT  first_name_ne   CHECK (LENGTH(first_name) > 0),
    CONSTRAINT  last_name_ne    CHECK (LENGTH(last_name) > 0),
    CONSTRAINT  email_ne        CHECK (LENGTH(email) > 0),
    CONSTRAINT  phone_number_ne CHECK (LENGTH(phone_number) > 0),
    CONSTRAINT  emp_dept_fk     FOREIGN KEY (department_id)
            REFERENCES departments (department_id)
);
