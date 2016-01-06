package tk.mybatis.mapper.model;

import javax.persistence.*;

@Table(name = "public.lang")
public class Lang {
    @Id
    private String lang;

    /**
     * 显示名称
     */
    private String display;

    @Column(name = "country_id")
    private Integer countryId;

    private String currency;

    /**
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 获取显示名称
     *
     * @return display - 显示名称
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 设置显示名称
     *
     * @param display 显示名称
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}