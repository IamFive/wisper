package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.continent")
public class Continent {
    /**
     * pk
     */
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 短编码
     */
    private String abbr;

    /**
     * 显示名称
     */
    private Object display;

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
     * 获取短编码
     *
     * @return abbr - 短编码
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * 设置短编码
     *
     * @param abbr 短编码
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