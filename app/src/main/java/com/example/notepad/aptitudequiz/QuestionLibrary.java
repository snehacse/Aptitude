package com.example.notepad.aptitudequiz;

public class QuestionLibrary {

    private String mQuestions [] = {
            "The ratio between the length and the breadth of a rectangular park is 3:2.If a man cyling along" +
                    "the boundary of the park at the speed of 12km/hr completed one round in 8 minutes, then the " +
                    "area of the park(in sqm.m)is:?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright."

    };


    private String mChoices [][] = {
            {"15360", "153600", "3070720"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"}
    };



    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
