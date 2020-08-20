package com.dwitech.saas.esurvey.core.entity;

import javax.persistence.*;

@Table(name = "survey_category", schema = "", catalog = "esurvey")
@IdClass(com.dwitech.saas.esurvey.core.entity.SurveyCategoryPK.class)
public class SurveyCategory {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long surveyId;

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    @Id
    @Column(name = "survey_id")
    public long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(long surveyId) {
        this.surveyId = surveyId;
    }

    private long categoryId;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Id
    @Column(name = "category_id")
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyCategory that = (SurveyCategory) o;

        if (id != that.id) return false;
        if (surveyId != that.surveyId) return false;
        if (categoryId != that.categoryId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (surveyId ^ (surveyId >>> 32));
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        return result;
    }
}
