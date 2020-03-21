package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.enums.QuestionType;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public class DateAnswer extends Answer {
    Date answerDate;

    @Override
    public QuestionType getAnswerType() {
        return QuestionType.DATE_QUESTION;
    }
}
