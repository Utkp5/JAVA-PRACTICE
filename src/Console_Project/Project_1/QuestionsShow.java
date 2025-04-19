package Console_Project.Project_1;

import java.util.Scanner;

class QuestionsShow {

    Questions[] questions = new Questions[5];
    String[] selection = new String[5];

    public QuestionsShow()
    {
        questions[0] = new Questions(1, "Which keyword is used to inherit a class in Java?", "super", "this", "extends", "implements", "extends");
        questions[1] = new Questions(2, "Which method is the entry point of a Java program?", "start()", "init()", "main()", "run()", "main()");
        questions[2] = new Questions(3, "Which of these is not a primitive data type?", "int", "boolean", "String", "char", "String");
        questions[3] = new Questions(4, "Which loop is guaranteed to run at least once?", "for", "while", "do-while", "foreach", "do-while");
        questions[4] = new Questions(5, "Which operator is used for comparison?", "+", "=", "==", "!", "==");
    }


    public void playQuiz() {
        int i = 0;
        for (Questions q : questions) {
            System.out.print("Question no. " + q.getId() + ":");
            System.out.println(" " + q.getQuestion());
            System.out.println("Option A : " + q.getOpt1());
            System.out.println("Option B : " + q.getOpt2());
            System.out.println("Option C : " + q.getOpt3());
            System.out.println("Option D : " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Your Answer : ");
            selection[i] = sc.nextLine();
            i++;

        }

        System.out.println("==========================================");
        for (String s : selection) {
            System.out.println(s);
        }

    }

    
    public void playerScore()
    {
        int score = 0;

        for (int i = 0; i < questions.length; i++) 
        {
            Questions que = questions[i];  
            String actualAnswer = que.getAnswer();
            
            String userAnswer = selection[i];
            
            if (actualAnswer.equalsIgnoreCase(userAnswer)) 
            {
                score++;
            }
        }
        
        System.out.println("Your Total Score : " + score);

    }

}