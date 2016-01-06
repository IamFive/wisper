package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.age_group")
public class AgeGroup {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "age_from")
    private Integer ageFrom;

    @Column(name = "age_to")
    private Integer ageTo;

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
     * @return item_id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * @return group_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return age_from
     */
    public Integer getAgeFrom() {
        return ageFrom;
    }

    /**
     * @param ageFrom
     */
    public void setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
    }

    /**
     * @return age_to
     */
    public Integer getAgeTo() {
        return ageTo;
    }

    /**
     * @param ageTo
     */
    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }
}