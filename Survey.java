package com.dwitech.saas.esurvey.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Survey {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id", table = "survey")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long hostId;

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    @Basic
    @Column(name = "host_id", table = "survey")
    public long getHostId() {
        return hostId;
    }

    public void setHostId(long hostId) {
        this.hostId = hostId;
    }

    private String title;

    @Basic
    @Column(name = "title", table = "survey")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String metaTitle;

    @Basic
    @Column(name = "meta_title", table = "survey")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    private String slug;

    @Basic
    @Column(name = "slug", table = "survey")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    private String summary;

    @Basic
    @Column(name = "summary", table = "survey")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    private long surveyTypeId;

    public void setSurveyTypeId(Long surveyTypeId) {
        this.surveyTypeId = surveyTypeId;
    }

    @Basic
    @Column(name = "survey_type_id", table = "survey")
    public long getSurveyTypeId() {
        return surveyTypeId;
    }

    public void setSurveyTypeId(long surveyTypeId) {
        this.surveyTypeId = surveyTypeId;
    }

    private byte published;

    public void setPublished(Byte published) {
        this.published = published;
    }

    @Basic
    @Column(name = "published", table = "survey")
    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
    }

    private Timestamp createdAt;

    @Basic
    @Column(name = "created_at", table = "survey")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Timestamp updatedAt;

    @Basic
    @Column(name = "updated_at", table = "survey")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Timestamp publishedAt;

    @Basic
    @Column(name = "published_at", table = "survey")
    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    private Timestamp startsAt;

    @Basic
    @Column(name = "starts_at", table = "survey")
    public Timestamp getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Timestamp startsAt) {
        this.startsAt = startsAt;
    }

    private Timestamp endsAt;

    @Basic
    @Column(name = "ends_at", table = "survey")
    public Timestamp getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Timestamp endsAt) {
        this.endsAt = endsAt;
    }

    private String content;

    @Basic
    @Column(name = "content", table = "survey")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Survey survey = (Survey) o;

        if (id != survey.id) return false;
        if (hostId != survey.hostId) return false;
        if (surveyTypeId != survey.surveyTypeId) return false;
        if (published != survey.published) return false;
        if (title != null ? !title.equals(survey.title) : survey.title != null) return false;
        if (metaTitle != null ? !metaTitle.equals(survey.metaTitle) : survey.metaTitle != null) return false;
        if (slug != null ? !slug.equals(survey.slug) : survey.slug != null) return false;
        if (summary != null ? !summary.equals(survey.summary) : survey.summary != null) return false;
        if (createdAt != null ? !createdAt.equals(survey.createdAt) : survey.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(survey.updatedAt) : survey.updatedAt != null) return false;
        if (publishedAt != null ? !publishedAt.equals(survey.publishedAt) : survey.publishedAt != null) return false;
        if (startsAt != null ? !startsAt.equals(survey.startsAt) : survey.startsAt != null) return false;
        if (endsAt != null ? !endsAt.equals(survey.endsAt) : survey.endsAt != null) return false;
        if (content != null ? !content.equals(survey.content) : survey.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (hostId ^ (hostId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (int) (surveyTypeId ^ (surveyTypeId >>> 32));
        result = 31 * result + (int) published;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (publishedAt != null ? publishedAt.hashCode() : 0);
        result = 31 * result + (startsAt != null ? startsAt.hashCode() : 0);
        result = 31 * result + (endsAt != null ? endsAt.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
