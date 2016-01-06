package tk.mybatis.mapper.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "public.poi")
public class Poi {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 二级分类id
     */
    @Column(name = "c2_id")
    private Integer c2Id;

    /**
     * 二级分类 - 存储poic表的name
     */
    @Column(name = "c2_name")
    private String c2Name;

    /**
     * 一级分类id
     */
    @Column(name = "c1_id")
    private Integer c1Id;

    /**
     * 一级分类 - 存储poic表的name
     */
    @Column(name = "c1_name")
    private String c1Name;

    /**
     * 评分 - 100为满分
     */
    private Integer rank;

    /**
     * 简介
     */
    private String bio;

    /**
     * laitude
     */
    private BigDecimal lat;

    /**
     * longitude
     */
    private BigDecimal lon;

    /**
     * 门票费用 - 以分为单位, -1 - 非景点，0 - 门票0费用
     */
    @Column(name = "ticket_fee")
    private Long ticketFee;

    /**
     * 大概消费 - 分
     */
    private Long cost;

    /**
     * 联系电话
     */
    private String telephone;

    @Column(name = "seo_url")
    private String seoUrl;

    /**
     * country abbr
     */
    private String country;

    /**
     * province abbr
     */
    private String province;

    /**
     * continent abbr
     */
    private String continent;

    /**
     * city abbr
     */
    private String city;

    /**
     * currency abbr
     */
    private String currency;

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
     * 获取二级分类id
     *
     * @return c2_id - 二级分类id
     */
    public Integer getC2Id() {
        return c2Id;
    }

    /**
     * 设置二级分类id
     *
     * @param c2Id 二级分类id
     */
    public void setC2Id(Integer c2Id) {
        this.c2Id = c2Id;
    }

    /**
     * 获取二级分类 - 存储poic表的name
     *
     * @return c2_name - 二级分类 - 存储poic表的name
     */
    public String getC2Name() {
        return c2Name;
    }

    /**
     * 设置二级分类 - 存储poic表的name
     *
     * @param c2Name 二级分类 - 存储poic表的name
     */
    public void setC2Name(String c2Name) {
        this.c2Name = c2Name;
    }

    /**
     * 获取一级分类id
     *
     * @return c1_id - 一级分类id
     */
    public Integer getC1Id() {
        return c1Id;
    }

    /**
     * 设置一级分类id
     *
     * @param c1Id 一级分类id
     */
    public void setC1Id(Integer c1Id) {
        this.c1Id = c1Id;
    }

    /**
     * 获取一级分类 - 存储poic表的name
     *
     * @return c1_name - 一级分类 - 存储poic表的name
     */
    public String getC1Name() {
        return c1Name;
    }

    /**
     * 设置一级分类 - 存储poic表的name
     *
     * @param c1Name 一级分类 - 存储poic表的name
     */
    public void setC1Name(String c1Name) {
        this.c1Name = c1Name;
    }

    /**
     * 获取评分 - 100为满分
     *
     * @return rank - 评分 - 100为满分
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置评分 - 100为满分
     *
     * @param rank 评分 - 100为满分
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取简介
     *
     * @return bio - 简介
     */
    public String getBio() {
        return bio;
    }

    /**
     * 设置简介
     *
     * @param bio 简介
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * 获取laitude
     *
     * @return lat - laitude
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 设置laitude
     *
     * @param lat laitude
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * 获取longitude
     *
     * @return lon - longitude
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * 设置longitude
     *
     * @param lon longitude
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /**
     * 获取门票费用 - 以分为单位, -1 - 非景点，0 - 门票0费用
     *
     * @return ticket_fee - 门票费用 - 以分为单位, -1 - 非景点，0 - 门票0费用
     */
    public Long getTicketFee() {
        return ticketFee;
    }

    /**
     * 设置门票费用 - 以分为单位, -1 - 非景点，0 - 门票0费用
     *
     * @param ticketFee 门票费用 - 以分为单位, -1 - 非景点，0 - 门票0费用
     */
    public void setTicketFee(Long ticketFee) {
        this.ticketFee = ticketFee;
    }

    /**
     * 获取大概消费 - 分
     *
     * @return cost - 大概消费 - 分
     */
    public Long getCost() {
        return cost;
    }

    /**
     * 设置大概消费 - 分
     *
     * @param cost 大概消费 - 分
     */
    public void setCost(Long cost) {
        this.cost = cost;
    }

    /**
     * 获取联系电话
     *
     * @return telephone - 联系电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话
     *
     * @param telephone 联系电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    /**
     * 获取country abbr
     *
     * @return country - country abbr
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country abbr
     *
     * @param country country abbr
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取province abbr
     *
     * @return province - province abbr
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置province abbr
     *
     * @param province province abbr
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取continent abbr
     *
     * @return continent - continent abbr
     */
    public String getContinent() {
        return continent;
    }

    /**
     * 设置continent abbr
     *
     * @param continent continent abbr
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * 获取city abbr
     *
     * @return city - city abbr
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city abbr
     *
     * @param city city abbr
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取currency abbr
     *
     * @return currency - currency abbr
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency abbr
     *
     * @param currency currency abbr
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}