package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.enums.QuestionType;

/**
 * @author Justus Schneider
 */

public class ChoiceAnswer extends Answer{
    private String answertText;

    @Override
    public QuestionType getAnswerType() {
        return QuestionType.CHOICE_QUESTION;
    }
}
