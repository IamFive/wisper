package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.poi_category")
public class PoiCategory {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    private String name;

    private Object display;

    /**
     * 评分
     */
    private Integer rank;

    /**
     * 是否显示
     */
    private Boolean valid;

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
     * @return display
     */
    public Object getDisplay() {
        return display;
    }

    /**
     * @param display
     */
    public void setDisplay(Object display) {
        this.display = display;
    }

    /**
     * 获取评分
     *
     * @return rank - 评分
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置评分
     *
     * @param rank 评分
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取是否显示
     *
     * @return valid - 是否显示
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * 设置是否显示
     *
     * @param valid 是否显示
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}