package com.wirvsvirus.selftest.api.Criteria;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public class TravelingCriteria {


    private int score;
    private Date travelDate;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }
}
