package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.item_category")
public class ItemCategory {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    private Integer rank;

    private Boolean valid;

    @Column(name = "seo_url")
    private String seoUrl;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * @return seo_url
     */
    public String getSeoUrl() {
        return seoUrl;
    }

    /**
     * @param seoUrl
     */
    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }
}