package com.wirvsvirus.selftest.api.Criteria;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public class SymptomsCriteria {

    private int score;
    private Date symptomStartDate;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getSymptomStartDate() {
        return symptomStartDate;
    }

    public void setSymptomStartDate(Date symptomStartDate) {
        this.symptomStartDate = symptomStartDate;
    }
}
