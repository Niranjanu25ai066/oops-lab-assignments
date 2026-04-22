
enum Result{
    CORRECT ,WRONG,UNANSWERED
}

public class QuizGrader{
    public static void main(String[] args) {
        char[] Correct={'C','A','B','D','B','C','C','A'};
        int correct = 0,wrong=0, unanswered=0;
        System.out.println("QUESTION SUBMITTED CORRECT  RESULT");
        for (int i = 0; i < Correct.length; i++) {
            char submitted = args[i].charAt(0);
            Result result;
            if(submitted == 'X'){
                result=Result.UNANSWERED;
                unanswered++;
            }
            else if(submitted ==Correct[i]){
                result= Result.CORRECT;
                correct++;

            }
            else {
                result = Result.WRONG;
                wrong++;


            }
            System.out.println((i+1) +"        " + submitted +"        " + Correct[i] +"        " + result ) ;
            
        
        
    }
    System.out.println("\ncorrectly answered"+correct);
    System.out.println("wrong answer"+wrong);
    System.out.println("questions unanswered"+ unanswered);
}
}