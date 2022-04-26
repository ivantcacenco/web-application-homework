CREATE SEQUENCE employees_seq
 START WITH     131
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


ALTER TABLE employees
    MODIFY employee_id DEFAULT employees_seq.nextval;
