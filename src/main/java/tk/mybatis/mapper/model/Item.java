package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "public.item")
public class Item {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    private String name;

    @Column(name = "poi_id")
    private Integer poiId;

    /**
     * 是否区分年龄段
     */
    @Column(name = "age_group_required")
    private Boolean ageGroupRequired;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

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
     * @return poi_id
     */
    public Integer getPoiId() {
        return poiId;
    }

    /**
     * @param poiId
     */
    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    /**
     * 获取是否区分年龄段
     *
     * @return age_group_required - 是否区分年龄段
     */
    public Boolean getAgeGroupRequired() {
        return ageGroupRequired;
    }

    /**
     * 设置是否区分年龄段
     *
     * @param ageGroupRequired 是否区分年龄段
     */
    public void setAgeGroupRequired(Boolean ageGroupRequired) {
        this.ageGroupRequired = ageGroupRequired;
    }

    /**
     * @return created_on
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return updated_on
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * @param updatedOn
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}