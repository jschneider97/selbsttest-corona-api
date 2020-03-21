package com.wirvsvirus.selftest.api.selftest;

import com.wirvsvirus.selftest.api.BaseDto;
import com.wirvsvirus.selftest.api.Criteria.*;

import java.util.List;
import java.util.Map;

/**
 * @author Justus Schneider
 */

public class Selftest extends BaseDto {

    private Boolean finished;
    List<Question> questions;

    ContactCriteria contactCriteria;
    SymptomsCriteria symptomsCriteria;
    TravelingCriteria travelingCriteria;
    RiskGroupCriteria riskGroupCriteria;
    SymptomsHighCriteria symptomsHighCriteria;
    SymptomsMediumCriteria symptomsMediumCriteria;


    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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

    public RiskGroupCriteria getRiskGroupCriteria() {
        return riskGroupCriteria;
    }

    public void setRiskGroupCriteria(RiskGroupCriteria riskGroupCriteria) {
        this.riskGroupCriteria = riskGroupCriteria;
    }

    public SymptomsHighCriteria getSymptomsHighCriteria() {
        return symptomsHighCriteria;
    }

    public void setSymptomsHighCriteria(SymptomsHighCriteria symptomsHighCriteria) {
        this.symptomsHighCriteria = symptomsHighCriteria;
    }

    public SymptomsMediumCriteria getSymptomsMediumCriteria() {
        return symptomsMediumCriteria;
    }

    public void setSymptomsMediumCriteria(SymptomsMediumCriteria symptomsMediumCriteria) {
        this.symptomsMediumCriteria = symptomsMediumCriteria;
    }
}
