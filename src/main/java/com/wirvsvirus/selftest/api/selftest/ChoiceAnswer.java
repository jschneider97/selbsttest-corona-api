package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.enums.QuestionType;

/**
 * @author Justus Schneider
 */

public class ChoiceAnswer extends Answer{
    private String answertText;

    public String getAnswertText() {
        return answertText;
    }

    public void setAnswertText(String answertText) {
        this.answertText = answertText;
    }

    public QuestionType getAnswerType() {
        return QuestionType.CHOICE_QUESTION;
    }
}
