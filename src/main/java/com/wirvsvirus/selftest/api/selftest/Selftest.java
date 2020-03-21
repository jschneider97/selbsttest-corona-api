package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.BaseDto;
import com.wirvsvirus.selftest.api.Criteria.ContactCriteria;
import com.wirvsvirus.selftest.api.Criteria.SymptomsCriteria;
import com.wirvsvirus.selftest.api.Criteria.TravelingCriteria;

import java.util.Map;

/**
 * @author Justus Schneider
 */

public class Selftest extends BaseDto {

    private Boolean finished;
    Map<Question, Answer> answers;
    ContactCriteria contactCriteria;
    SymptomsCriteria symptomsCriteria;
    TravelingCriteria travelingCriteria;
    //...


    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Map<Question, Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Question, Answer> answers) {
        this.answers = answers;
    }

    public ContactCriteria getContactCriteria() {
        return contactCriteria;
    }

    public void setContactCriteria(ContactCriteria contactCriteria) {
        this.contactCriteria = contactCriteria;
    }

    public SymptomsCriteria getSymptomsCriteria() {
        return symptomsCriteria;
    }

    public void setSymptomsCriteria(SymptomsCriteria symptomsCriteria) {
        this.symptomsCriteria = symptomsCriteria;
    }

    public TravelingCriteria getTravelingCriteria() {
        return travelingCriteria;
    }

    public void setTravelingCriteria(TravelingCriteria travelingCriteria) {
        this.travelingCriteria = travelingCriteria;
    }
}
