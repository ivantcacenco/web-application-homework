CREATE SEQUENCE departments_seq
 START WITH     280
 INCREMENT BY   10
 MAXVALUE       9990
 NOCACHE
 NOCYCLE;

ALTER TABLE departments
    MODIFY department_id DEFAULT departments_seq.nextval;
