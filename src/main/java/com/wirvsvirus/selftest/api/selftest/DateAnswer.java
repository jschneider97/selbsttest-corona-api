package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.enums.QuestionType;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public class DateAnswer extends Answer {
    public Date answerDate;

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }
    public QuestionType getAnswerType() {
        return QuestionType.DATE_QUESTION;
    }
}
