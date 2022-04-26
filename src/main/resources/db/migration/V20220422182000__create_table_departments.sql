CREATE TABLE departments
(
    department_id   NUMBER(4) PRIMARY KEY,
    department_name VARCHAR2(30) NOT NULL,
    location        VARCHAR2(30) NOT NULL,
    CONSTRAINT dept_name_ne CHECK (LENGTH(department_name) > 0),
    CONSTRAINT loc_ne       CHECK (LENGTH(location) > 0)
);
