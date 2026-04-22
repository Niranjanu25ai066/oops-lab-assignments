enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

public class Test{
    public static void main(String[] args) {

        // Correct answers
        char[] correctAns = {'C', 'A', 'B', 'D'};

        int correct = 0, wrong = 0;

        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");

        for (int i = 0; i < correctAns.length; i++) {

            char submitted;

            // If argument not provided, treat as 'X'
            if (i < args.length) {
                submitted = args[i].charAt(0);
            } else {
                submitted = 'X';
            }

            Result res;

            if (submitted == 'X') {
                res = Result.NOT_ANSWERED;
            } else if (submitted == correctAns[i]) {
                res = Result.CORRECT;
                correct++;
            } else {
                res = Result.WRONG;
                wrong++;
            }

            System.out.println((i + 1) + "\t\t" + submitted + "\t\t" 
                    + correctAns[i] + "\t\t" + res);
        }

        System.out.println("\nNo. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);

        // Pass condition
        if (correct >= 2) {
            System.out.println("The candidate passed.");
        } else {
            System.out.println("The candidate failed.");
        }
    }
}