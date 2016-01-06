package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.poi_package")
public class PoiPackage {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    @Column(name = "poi_id")
    private Integer poiId;

    /**
     * 多语言
     */
    private String lang;

    @Column(name = "site_url")
    private String siteUrl;

    @Column(name = "display_name")
    private String displayName;

    private String bio;

    private String address;

    /**
     * 开放时间
     */
    @Column(name = "open_hour")
    private Object openHour;

    /**
     * 到达方式
     */
    private Object traffic;

    /**
     * 小编备注
     */
    private Object tips;

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
     * 获取多语言
     *
     * @return lang - 多语言
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置多语言
     *
     * @param lang 多语言
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return site_url
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * @param siteUrl
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * @return display_name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取开放时间
     *
     * @return open_hour - 开放时间
     */
    public Object getOpenHour() {
        return openHour;
    }

    /**
     * 设置开放时间
     *
     * @param openHour 开放时间
     */
    public void setOpenHour(Object openHour) {
        this.openHour = openHour;
    }

    /**
     * 获取到达方式
     *
     * @return traffic - 到达方式
     */
    public Object getTraffic() {
        return traffic;
    }

    /**
     * 设置到达方式
     *
     * @param traffic 到达方式
     */
    public void setTraffic(Object traffic) {
        this.traffic = traffic;
    }

    /**
     * 获取小编备注
     *
     * @return tips - 小编备注
     */
    public Object getTips() {
        return tips;
    }

    /**
     * 设置小编备注
     *
     * @param tips 小编备注
     */
    public void setTips(Object tips) {
        this.tips = tips;
    }
}