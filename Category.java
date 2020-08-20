package com.dwitech.saas.esurvey.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

public class Category {
    private long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id", table = "category")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Long parentId;

    @Basic
    @Column(name = "parent_id", table = "category")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    private String title;

    @Basic
    @Column(name = "title", table = "category")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String metaTitle;

    @Basic
    @Column(name = "meta_title", table = "category")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    private String slug;

    @Basic
    @Column(name = "slug", table = "category")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    private String content;

    @Basic
    @Column(name = "content", table = "category")
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

        Category category = (Category) o;

        if (id != category.id) return false;
        if (parentId != null ? !parentId.equals(category.parentId) : category.parentId != null) return false;
        if (title != null ? !title.equals(category.title) : category.title != null) return false;
        if (metaTitle != null ? !metaTitle.equals(category.metaTitle) : category.metaTitle != null) return false;
        if (slug != null ? !slug.equals(category.slug) : category.slug != null) return false;
        if (content != null ? !content.equals(category.content) : category.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (metaTitle != null ? metaTitle.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
