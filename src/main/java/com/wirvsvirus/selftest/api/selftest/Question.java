package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.BaseDto;
import com.wirvsvirus.selftest.api.enums.Criteria;
import com.wirvsvirus.selftest.api.enums.QuestionType;

import java.awt.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Justus Schneider
 */

public class Question extends BaseDto {

    private String questionText;
    private Criteria criteria;
    //SingleChoice oder Date
    private QuestionType questionType;

    private List<ChoiceAnswer> answers;
    private Answer answer;

    private Map<Question, Answer> conditions;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public List<ChoiceAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<ChoiceAnswer> answers) {
        this.answers = answers;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Map<Question, Answer> getConditions() {
        return conditions;
    }

    public void setConditions(Map<Question, Answer> conditions) {
        this.conditions = conditions;
    }
}
