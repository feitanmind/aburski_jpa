-- inserting to table doctor
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (1, 'John', 'Smith', '+1 123-456-7890', 'john.smith@example.com', 'D12345', 'Cardiology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (2, 'Jane', 'Doe', '+1 987-654-3210', 'jane.doe@example.com', 'D54321', 'Pediatrics');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (3, 'Michael', 'Johnson', '+1 555-123-4567', 'michael.johnson@example.com', 'D67890', 'Orthopedics');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (4, 'Emily', 'Brown', '+1 888-555-1234', 'emily.brown@example.com', 'D24680', 'Dermatology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (5, 'Robert', 'Lee', '+1 777-999-8888', 'robert.lee@example.com', 'D13579', 'Neurology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (6, 'Maria', 'Garcia', '+1 333-444-5555', 'maria.garcia@example.com', 'D98765', 'Oncology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (7, 'David', 'Wang', '+1 222-333-4444', 'david.wang@example.com', 'D56789', 'Gastroenterology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (8, 'Sophia', 'Kim', '+1 777-888-9999', 'sophia.kim@example.com', 'D01234', 'Endocrinology');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (9, 'Daniel', 'Martinez', '+1 555-777-8888', 'daniel.martinez@example.com', 'D43210', 'Psychiatry');
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES (10, 'Olivia', 'Lopez', '+1 999-888-7777', 'olivia.lopez@example.com', 'D76543', 'Obstetrics');

-- inserting data to patient
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (1, 'Alice', 'Johnson', '+1 123-456-7890', 'alice.johnson@example.com', 'P12345', '1990-05-15', '2024-05-06', 'FEMALE', '90051512345');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (2, 'Bob', 'Smith', '+1 987-654-3210', 'bob.smith@example.com', 'P54321', '1985-08-20', '2024-05-06', 'MALE', '85082054321');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (3, 'Carol', 'Brown', '+1 555-123-4567', 'carol.brown@example.com', 'P67890', '1978-03-10', '2024-05-06', 'FEMALE', '78031067890');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (4, 'David', 'Lee', '+1 888-555-1234', 'david.lee@example.com', 'P24680', '1995-11-25', '2024-05-06', 'MALE', '95112524680');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (5, 'Eva', 'Garcia', '+1 777-999-8888', 'eva.garcia@example.com', 'P13579', '2000-02-18', '2024-05-06', 'FEMALE', '00021813579');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (6, 'Frank', 'Martinez', '+1 333-444-5555', 'frank.martinez@example.com', 'P98765', '1982-09-05', '2024-05-06', 'MALE', '82090598765');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (7, 'Grace', 'Wang', '+1 222-333-4444', 'grace.wang@example.com', 'P56789', '1998-07-12', '2024-05-06', 'FEMALE', '98071256789');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (8, 'Henry', 'Kim', '+1 777-888-9999', 'henry.kim@example.com', 'P01234', '1989-04-30', '2024-05-06', 'MALE', '89043001234');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (9, 'Isabel', 'Lopez', '+1 555-777-8888', 'isabel.lopez@example.com', 'P43210', '1993-12-08', '2024-05-06', 'FEMALE', '93120843210');
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, registration_date, sex, pesel_number)
VALUES (10, 'Jack', 'Davis', '+1 999-888-7777', 'jack.davis@example.com', 'P76543', '1975-06-22', '2024-05-06', 'MALE', '75062276543');

-- inserting data to address
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (1, 'Seattle', '123 Main St', 'Apt 101', '98101', 1);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (2, 'Bellevue', '456 Elm St', NULL, '98004', 2);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (3, 'Redmond', '789 Oak Ave', 'Suite 201', '98052', 3);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (4, 'Kirkland', '567 Pine Rd', 'Unit B', '98033', 4);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (5, 'Bothell', '890 Maple Dr', NULL, '98011', 5);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (6, 'Issaquah', '111 Cedar Ln', 'Apt 303', '98027', 6);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (7, 'Sammamish', '222 Birch Blvd', NULL, '98074', 7);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (8, 'Woodinville', '333 Willow Way', 'Suite 102', '98072', 8);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (9, 'Mercer Island', '444 Spruce St', NULL, '98040', 9);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, doctor_id)
VALUES (10, 'Duvall', '555 Oakwood Ct', 'Unit C', '98019', 10);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (11, 'Warsaw', '123 Main St', 'Apt 101', '00-001', 1);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (12, 'Krakow', '456 Elm St', NULL, '30-002', 2);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (13, 'Gdansk', '789 Oak Ave', 'Suite 201', '80-003', 3);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (14, 'Wroclaw', '567 Pine Rd', 'Unit B', '50-004', 4);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (15, 'Poznan', '890 Maple Dr', NULL, '60-005', 5);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (16, 'Lodz', '111 Cedar Ln', 'Apt 303', '90-006', 6);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (17, 'Szczecin', '222 Birch Blvd', NULL, '70-007', 7);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (18, 'Katowice', '333 Willow Way', 'Suite 102', '40-008', 8);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (19, 'Bydgoszcz', '444 Spruce St', NULL, '85-009', 9);
INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id)
VALUES (20, 'Lublin', '555 Oakwood Ct', 'Unit C', '20-010', 10);

--inserts visits
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (1, 'Routine checkup', '2024-05-06 10:00:00', 1, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (2, 'Follow-up appointment', '2024-05-08 14:30:00', 2, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (3, 'Emergency visit', '2024-05-10 17:15:00', 4, 3);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (4, 'Annual physical', '2024-05-12 09:45:00', 4, 4);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (5, 'Medication review', '2024-05-14 11:30:00', 5, 5);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (6, 'Post-surgery follow-up', '2024-05-16 13:20:00', 1, 6);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (7, 'Dental consultation', '2024-05-18 15:10:00', 7, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (8, 'Lab test results discussion', '2024-05-20 17:00:00', 8, 3);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (9, 'Physical therapy session', '2024-05-22 08:30:00', 9, 3);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (10, 'Nutrition counseling', '2024-05-24 10:15:00', 4, 4);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (11, 'Emergency visit', '2024-05-10 17:46:00', 10, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (12, 'Medication review', '2024-05-14 13:30:00', 5, 5);



