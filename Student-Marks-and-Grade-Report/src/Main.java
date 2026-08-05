
public class Main {

    public static void main(String[] args) {
        // Student details
        String studentName = "Manisha";

        // Five subject marks
        int subject1 = 42;
        int subject2 = 67;
        int subject3 = 31;
        int subject4 = 58;
        int subject5 = 76;

        // Variables for calculation
        int totalMarks = 0;
        int passedSubjects = 0;
        int failedSubjects = 0;

        boolean validMarks = true;

        int i = 1;

        // Process five subjects using while loop
        while (i <= 5) {

            int marks = 0;

            if (i == 1) {
                marks = subject1;
            } else if (i == 2) {
                marks = subject2;
            } else if (i == 3) {
                marks = subject3;
            } else if (i == 4) {
                marks = subject4;
            } else {
                marks = subject5;
            }

            // Validate marks
            if (marks < 0 || marks > 100) {
                validMarks = false;
            } else {
                totalMarks += marks;

                if (marks >= 35) {
                    passedSubjects++;
                } else {
                    failedSubjects++;
                }
            }

            i++;
        }

        // Calculate average and percentage
        double average = (double) totalMarks / 5;
        double percentage = (double) totalMarks / 500 * 100;

        // Overall result
        boolean overallPass = validMarks && failedSubjects == 0;

        String result = overallPass ? "PASS" : "FAIL";

        // Grade
        String grade;

        if (!validMarks) {
            grade = "Invalid Marks";
        } else if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Needs Improvement";
        }

        // Next-level eligibility
        String eligibility = overallPass ? "Eligible" : "Not Eligible";

        // Final message
        String message;

        if (!validMarks) {
            message = "Please enter valid marks between 0 and 100.";
        } else if (overallPass) {
            message = "Congratulations! You can proceed to the next level.";
        } else {
            message = "You need to improve the failed subjects.";
        }

        // Output
        System.out.println("STUDENT MARKS REPORT");
        System.out.println("-----------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println();
        System.out.println("Passed Subjects: " + passedSubjects);
        System.out.println("Failed Subjects: " + failedSubjects);
        System.out.println();
        System.out.println("Overall Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("Next-Level Eligibility: " + eligibility);
        System.out.println("Final Message: " + message);
    }
}
