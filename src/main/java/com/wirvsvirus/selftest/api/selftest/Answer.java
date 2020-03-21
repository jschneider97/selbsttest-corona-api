package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.BaseDto;
import com.wirvsvirus.selftest.api.enums.QuestionType;

/**
 * @author Justus Schneider
 */

public abstract class Answer extends BaseDto {
    private int scoreImpact;

    public int getScoreImpact() {
        return scoreImpact;
    }

    public void setScoreImpact(int scoreImpact) {
        this.scoreImpact = scoreImpact;
    }

    public abstract QuestionType getAnswerType();
}
