package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.province")
public class Province {
    /**
     * pk
     */
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    /**
     * 名称
     */
    private String name;

    private String abbr;

    /**
     * 显示名称
     */
    private Object display;

    @Column(name = "continent_id")
    private Integer continentId;

    /**
     * 所属州
     */
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "seo_url")
    private String seoUrl;

    /**
     * 获取pk
     *
     * @return id - pk
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置pk
     *
     * @param id pk
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return abbr
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * @param abbr
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    /**
     * 获取显示名称
     *
     * @return display - 显示名称
     */
    public Object getDisplay() {
        return display;
    }

    /**
     * 设置显示名称
     *
     * @param display 显示名称
     */
    public void setDisplay(Object display) {
        this.display = display;
    }

    /**
     * @return continent_id
     */
    public Integer getContinentId() {
        return continentId;
    }

    /**
     * @param continentId
     */
    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    /**
     * 获取所属州
     *
     * @return country_id - 所属州
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 设置所属州
     *
     * @param countryId 所属州
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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