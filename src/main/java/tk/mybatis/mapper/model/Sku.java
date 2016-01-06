package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "public.sku")
public class Sku {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    @Column(name = "`item_id `")
    private Integer itemId;

    @Column(name = "sku_name")
    private String skuName;

    /**
     * 人群id
     */
    @Column(name = "age_group_id")
    private Integer ageGroupId;

    /**
     * 年龄显示信息
     */
    @Column(name = "age_group_display")
    private String ageGroupDisplay;

    /**
     * 规格 {"规格":"规格值"}
     */
    private Object specifications;

    /**
     * 是否需要指定使用日期
     */
    @Column(name = "is_tour_date_required")
    private Boolean isTourDateRequired;

    @Column(name = "use_in_days")
    private Integer useInDays;

    /**
     * 起始有效期
     */
    @Column(name = "valid_start_on")
    private Date validStartOn;

    /**
     * 有效期截止
     */
    @Column(name = "valid_end_on")
    private Date validEndOn;

    /**
     * 1 - 编辑中; 4 - 待审核; 8 - 售卖中; 12 - 已下架;
     */
    private String status;

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
     * @return sku_name
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * @param skuName
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * 获取人群id
     *
     * @return age_group_id - 人群id
     */
    public Integer getAgeGroupId() {
        return ageGroupId;
    }

    /**
     * 设置人群id
     *
     * @param ageGroupId 人群id
     */
    public void setAgeGroupId(Integer ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    /**
     * 获取年龄显示信息
     *
     * @return age_group_display - 年龄显示信息
     */
    public String getAgeGroupDisplay() {
        return ageGroupDisplay;
    }

    /**
     * 设置年龄显示信息
     *
     * @param ageGroupDisplay 年龄显示信息
     */
    public void setAgeGroupDisplay(String ageGroupDisplay) {
        this.ageGroupDisplay = ageGroupDisplay;
    }

    /**
     * 获取规格 {"规格":"规格值"}
     *
     * @return specifications - 规格 {"规格":"规格值"}
     */
    public Object getSpecifications() {
        return specifications;
    }

    /**
     * 设置规格 {"规格":"规格值"}
     *
     * @param specifications 规格 {"规格":"规格值"}
     */
    public void setSpecifications(Object specifications) {
        this.specifications = specifications;
    }

    /**
     * 获取是否需要指定使用日期
     *
     * @return is_tour_date_required - 是否需要指定使用日期
     */
    public Boolean getIsTourDateRequired() {
        return isTourDateRequired;
    }

    /**
     * 设置是否需要指定使用日期
     *
     * @param isTourDateRequired 是否需要指定使用日期
     */
    public void setIsTourDateRequired(Boolean isTourDateRequired) {
        this.isTourDateRequired = isTourDateRequired;
    }

    /**
     * @return use_in_days
     */
    public Integer getUseInDays() {
        return useInDays;
    }

    /**
     * @param useInDays
     */
    public void setUseInDays(Integer useInDays) {
        this.useInDays = useInDays;
    }

    /**
     * 获取起始有效期
     *
     * @return valid_start_on - 起始有效期
     */
    public Date getValidStartOn() {
        return validStartOn;
    }

    /**
     * 设置起始有效期
     *
     * @param validStartOn 起始有效期
     */
    public void setValidStartOn(Date validStartOn) {
        this.validStartOn = validStartOn;
    }

    /**
     * 获取有效期截止
     *
     * @return valid_end_on - 有效期截止
     */
    public Date getValidEndOn() {
        return validEndOn;
    }

    /**
     * 设置有效期截止
     *
     * @param validEndOn 有效期截止
     */
    public void setValidEndOn(Date validEndOn) {
        this.validEndOn = validEndOn;
    }

    /**
     * 获取1 - 编辑中; 4 - 待审核; 8 - 售卖中; 12 - 已下架;
     *
     * @return status - 1 - 编辑中; 4 - 待审核; 8 - 售卖中; 12 - 已下架;
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置1 - 编辑中; 4 - 待审核; 8 - 售卖中; 12 - 已下架;
     *
     * @param status 1 - 编辑中; 4 - 待审核; 8 - 售卖中; 12 - 已下架;
     */
    public void setStatus(String status) {
        this.status = status;
    }
}