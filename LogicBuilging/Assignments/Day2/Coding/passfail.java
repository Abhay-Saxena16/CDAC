/* Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. */

class PassFail{
    public static void main(String[] args) {
        
        int grade1 = 30;
        int grade2 = 46;
        int grade3 = 27;

        int failedSubjects = 0;

        if (grade1 <= 40) {
            failedSubjects++;
        }
        
        if (grade2 <= 40) {
            failedSubjects++;
        }
        
        if (grade3 <= 40) {
            failedSubjects++;
        }

        // Determine if the student passes or fails

        if (failedSubjects > 0) {
            System.out.println("Fail - Number of subjects failed: " + failedSubjects);
        } else {
            System.out.println("Pass");
        }

       
    }
}
