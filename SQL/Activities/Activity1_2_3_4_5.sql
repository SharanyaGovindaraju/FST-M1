REM   Script: Activity1_2_3_4_5
REM   FST_SQL_Day1

--Activity 1
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DESCRIBE salesman;

--Activity 2
INSERT ALL 
    INTO salesman VALUES('5001','James Hoog','New York','15') 
    INTO salesman VALUES('5002','Nail Knite','Paris ','13') 
    INTO salesman VALUES('5005','Pit Alex','London','11') 
    INTO salesman VALUES('5006','McLyon','Paris ','14') 
    INTO salesman VALUES('5007','Paul Adam','Rome','13') 
    INTO salesman VALUES('5003','Lauson Hen','San Jose','12') 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;
--Activity 3
SELECT salesman_id, salesman_city FROM salesman;

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris ';

--Activity4
ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;


--Activity 5
UPDATE salesman SET grade=200 Where salesman_city='Rome';

UPDATE salesman SET grade=300 Where salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' Where salesman_name='McLyon';

SELECT * FROM salesman;

