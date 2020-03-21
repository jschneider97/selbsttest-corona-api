package com.wirvsvirus.selftest.api.Criteria;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public class ContactCriteria {

    private int score;
    Date contactDate;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }
}
