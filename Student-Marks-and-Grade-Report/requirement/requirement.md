# Student Marks and Grade Report

## 1. Requirement

Create a Java program to evaluate the marks of a student in five subjects
and generate a marks and grade report.

The program should calculate total marks, average marks, percentage,
passed subjects, failed subjects, overall result, grade, next-level
eligibility, and a final message.

## 2. Input

The program uses hard-coded values only.

- Student name
- Marks of five subjects
- Marks should be between 0 and 100

Runtime input and Scanner are not used.

## 3. Passing Rule

- Passing marks for each subject are 35.
- If any subject mark is below 35, the overall result is FAIL.
- If all subjects are 35 or above, the overall result is PASS.

## 4. Grade Rules

- 90 and above → A+
- 80 to below 90 → A
- 70 to below 80 → B
- 60 to below 70 → C
- 50 to below 60 → D
- Below 50 → Needs Improvement

## 5. Calculations

The program calculates:

- Total marks
- Average marks
- Percentage
- Number of passed subjects
- Number of failed subjects

## 6. Variables and Data Types

- Student name → String
- Subject marks → int
- Total marks → int
- Passed subjects → int
- Failed subjects → int
- Average → double
- Percentage → double
- Result → boolean/String
- Grade → String

## 7. Operators Used

- Arithmetic operators
- Assignment operators
- Relational operators
- Logical operators
- Ternary operator

## 8. Loop

A while loop is used to process the five subjects.

## 9. Conditions

Conditions are used to:

- Validate marks
- Check whether a subject is passed or failed
- Determine the overall result
- Determine the grade based on percentage

## 10. Type Casting

Type casting is used while calculating average and percentage
to obtain decimal values.

## 11. Testing

The program is tested using two different sets of hard-coded marks.

The first test checks a passing case.

The second test checks a failing case where one subject has marks
below the passing mark.